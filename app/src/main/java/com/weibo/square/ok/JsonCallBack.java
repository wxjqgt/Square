package com.weibo.square.ok;

import com.alibaba.fastjson.JSON;
import com.zhy.http.okhttp.callback.Callback;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/7/17.
 */
public abstract class JsonCallBack<T> extends Callback<String> {

    private Class<T> beanClass;

    public JsonCallBack(Class<T> beanClass){
        this.beanClass = beanClass;
    }

    public abstract void onRequestSuccess(T t,String data,int id);
    public abstract void onRequestError(Call call, Exception e,int id);

    @Override
    public String parseNetworkResponse(Response response, int id) throws Exception {
        return response.body().string();
    }

    @Override
    public void onError(Call call, Exception e, int id) {
       onRequestError(call,e,id);
    }

    @Override
    public void onResponse(String response, int id) {
        T t = JSON.parseObject(response,beanClass);
        onRequestSuccess(t,response,id);
    }
}
