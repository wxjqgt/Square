package com.weibo.square;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.weibo.square.bean.douban.DouBan;
import com.weibo.square.ok.JsonCallBack;
import com.weibo.square.ok.OkhttpUtil;
import com.weibo.square.ok.retrofitService.BaiduService;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {

    private Button result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (Button) findViewById(R.id.result);

        //loadJson();
        //loadFile();
        //httpFile();
    }

    private void httpFile(){

    }

    private void loadFile() {
        Map<String, String> map = new HashMap<>();
        //uid=0&sign=&limit=10&offset=0&uuid=c66638466dd7f848f4d27b83b3b339c5
        map.put("uid", "0");
        map.put("sign", "");
        map.put("limit", "10");
        map.put("offset", "0");
        map.put("uuid", "c66638466dd7f848f4d27b83b3b339c5");

        String url = "http://api.haodou.com/" + BaiduService.url;

        OkHttpUtils.get().url(url).params(map).build()
                .execute(new JsonCallBack<DouBan>(DouBan.class) {
                    @Override
                    public void onRequestSuccess(DouBan douBan, String data, int id) {
                        result.setText(Arrays.asList(douBan.getResult()
                                        .getRecipe()
                                        .getList())
                                .get(0)
                                .toString());
                    }

                    @Override
                    public void onRequestError(okhttp3.Call call, Exception e, int id) {

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

        OkhttpUtil.getRetrofit("http://api.haodou.com/", BaiduService.class).getResult(map)
                .enqueue(new Callback<DouBan>() {
                    @Override
                    public void onResponse(Call<DouBan> call, retrofit2.Response<DouBan> response) {
                        DouBan douBan = response.body();
                        result.setText(Arrays.asList(douBan.getResult().getRecipe().getList()).get(0).toString());
                    }

                    @Override
                    public void onFailure(Call<DouBan> call, Throwable t) {

                    }
                });
    }
}
