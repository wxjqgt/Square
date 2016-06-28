package com.weibo.square.bean.douban;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Recommed {

    private Recommed.List[] list;
    private AD ad;

    public Recommed() {
    }

    public Recommed(List[] list, AD ad) {
        this.list = list;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Recommed{" +
                "list=" + Arrays.toString(list) +
                ", ad=" + ad +
                '}';
    }

    public List[] getList() {
        return list;
    }

    public void setList(List[] list) {
        this.list = list;
    }

    public AD getAd() {
        return ad;
    }

    public void setAd(AD ad) {
        this.ad = ad;
    }

    private static class AD{

        /**
         * Title : 夏至
         * Img : http://img1.hoto.cn/haodou/recipe_mobile_ad/2016/06/1466417956.jpg
         * Url : haodourecipe://haodou.com/opentopic/?url=http%3A%2F%2Fm.haodou.com%2Ftopic-469474.html&id=469474
         */

        private String Title;
        private String Img;
        private String Url;

        public AD() {
        }

        public AD(String title, String img, String url) {
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

    public static class List extends com.weibo.square.bean.douban.List {
        private String Intro;
        public List() {}

        public List(String title, String img, String url, String intro) {
            super(title, img, url);
            Intro = intro;
        }

        @Override
        public String toString() {
            return "List{" +
                    "Intro='" + Intro + '\'' +
                    '}';
        }

        public String getIntro() {
            return Intro;
        }

        public void setIntro(String intro) {
            Intro = intro;
        }
    }
}
