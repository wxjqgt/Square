package com.weibo.square.bean.douban;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Goods {

    /**
     * name : 到家商品
     * list : []
     */

    private String name;
    private List[] list;

    public Goods() {
    }

    public Goods(String name, List[] list) {
        this.name = name;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", list=" + Arrays.toString(list) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static class List extends com.weibo.square.bean.douban.List {
        private String SubTitle;

        public List() {
        }

        public List(String title, String img, String url, String subTitle) {
            super(title, img, url);
            SubTitle = subTitle;
        }

        @Override
        public String toString() {
            return "List{" +
                    "SubTitle='" + SubTitle + '\'' +
                    '}';
        }

        public String getSubTitle() {
            return SubTitle;
        }

        public void setSubTitle(String subTitle) {
            SubTitle = subTitle;
        }
    }
}
