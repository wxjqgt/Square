package com.weibo.square.ok;

import android.content.Context;
import android.support.annotation.Nullable;

import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/7/16.
 */
public class OkhttpUtil {

    private static ClearableCookieJar cookieJar;
    private static OkHttpClient okHttpClient;

    public static OkHttpClient getOkHttpClient(){
        return okHttpClient;
    }

    public static <T> T getRetrofit(String baseUrl, Class<T> beanClass) {
        return getBuilder()
                .baseUrl(baseUrl)
                .build()
                .create(beanClass);
    }

    public static void initOk(@Nullable Context context, @Nullable OkHttpClient client) {
        if (okHttpClient == null) {
            synchronized (OkhttpUtil.class) {
                if (okHttpClient == null) {
                    if (client != null) {
                        okHttpClient = client;
                    } else {
                        getClient(context);
                    }
                }
            }
        }
    }

    private static ClearableCookieJar getCookJar(Context context) {
        cookieJar = new PersistentCookieJar(
                new SetCookieCache(), new SharedPrefsCookiePersistor(context));
        return cookieJar;
    }

    private static OkHttpClient getClient(Context c) {
        okHttpClient = new OkHttpClient.Builder()
                .cookieJar(getCookJar(c))
                .readTimeout(7676, TimeUnit.MILLISECONDS)
                .connectTimeout(7676, TimeUnit.MILLISECONDS)
                .writeTimeout(7676,TimeUnit.MILLISECONDS)
                .build();
        return okHttpClient;
    }

    private static Retrofit.Builder getBuilder() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create());
        return builder;
    }

    public static void initOk(Context context) {
        initOk(context, null);
    }

    public static void clearCookie() {
        if (cookieJar != null) {
            cookieJar.clear();
        }
    }

}
