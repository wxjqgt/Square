package com.weibo.square.retrofitService;

import com.weibo.square.bean.douban.DouBan;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2016/6/21.
 */
public interface BaiduService {
    String url = "index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=+" +
            "json&sessionid=1461338384160&vc=83&vn=6.1.0&loguid=0&deviceid" +
            "=haodou860806027038297&uuid=c66638466dd7f848f4d27b83b3b339c5" +
            "&channel=meizu_v610&method=Index.index&virtual=&signmethod=m" +
            "d5&v=2&timestamp=1461338387&nonce=0.7953463564160073&appsign=" +
            "8bf14f32ae2ffc886fd7bc064754cbe0";
    @POST(url)
    @FormUrlEncoded
    Call<DouBan> getResult(@FieldMap() Map<String,String> map);
}
