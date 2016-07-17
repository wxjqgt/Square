package com.weibo.square;

import android.app.Application;
import android.content.Context;

import com.weibo.square.ok.OkhttpUtil;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2016/6/21.
 */
public class MainApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        OkhttpUtil.initOk(this);
        OkHttpUtils.initClient(OkhttpUtil.getOkHttpClient());
    }

    public static Context getAppContext(){
        return context;
    }
}
