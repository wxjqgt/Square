package com.weibo.square.bean.douban;

/**
 * Created by Administrator on 2016/6/21.
 */
public class List {

    /**
     * Title : 夏至
     * Img : http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/06/1466417956.jpg
     * Url : haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fm.haodou.com%2Ftopic-469474.html&id=469474
     */

    private String Title;
    private String Img;
    private String Url;

    public List() {
    }

    public List(String title, String img, String url) {
        Title = title;
        Img = img;
        Url = url;
    }

    @Override
    public String toString() {
        return "List{" +
                "Title='" + Title + '\'' +
                ", Img='" + Img + '\'' +
                ", Url='" + Url + '\'' +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
}
