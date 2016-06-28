package com.weibo.square;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.weibo.square.bean.douban.DouBan;
import com.weibo.square.retrofitService.BaiduService;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.OkHttpRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import dagger.Component;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);

        //loadJson();
        loadFile();
    }

    private void loadFile() {
        OkHttpUtils.get().url("http://www.baidu.com").build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(okhttp3.Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        result.setText(response);
                    }
                });
    }

    private void loadJson() {
        Map<String, String> map = new HashMap<>();
        //uid=0&sign=&limit=10&offset=0&uuid=c66638466dd7f848f4d27b83b3b339c5
        map.put("uid", "0");
        map.put("sign", "");
        map.put("limit", "10");
        map.put("offset", "0");
        map.put("uuid", "c66638466dd7f848f4d27b83b3b339c5");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.haodou.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BaiduService baidu = retrofit.create(BaiduService.class);
        Call<DouBan> r = baidu.getResult(map);
        r.enqueue(new Callback<DouBan>() {
            @Override
            public void onResponse(Call<DouBan> call, retrofit2.Response<DouBan> response) {
                DouBan douBan = null;
                if (response.body() instanceof DouBan) {
                    douBan = response.body();
                    result.setText(Arrays.asList(douBan.getResult().getRecipe().getList()).get(0).toString());
                }
            }

            @Override
            public void onFailure(Call<DouBan> call, Throwable t) {

            }
        });
    }
}
