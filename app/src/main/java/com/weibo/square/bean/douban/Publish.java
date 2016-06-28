package com.weibo.square.bean.douban;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Publish {

    /**
     * img : http://img1.hoto.cn/haodou/g/1/20151230/443e9e963bb.jpg
     * title : 分享美食
     * url : haodourecipe://haodou.com/publish/photo/?TagId=&TagName=&rid=&isTopic=0&static_type=6
     */

    private String img;
    private String title;
    private String url;

    public Publish() {
    }

    public Publish(String img, String title, String url) {
        this.img = img;
        this.title = title;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Publish{" +
                "img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
