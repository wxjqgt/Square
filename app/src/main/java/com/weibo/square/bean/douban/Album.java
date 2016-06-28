package com.weibo.square.bean.douban;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Album {

    /**
     * name : 热门专辑
     * url : haodourecipe://haodou.com/collect/list/
     * icon : http://www.haodou.com/public/images3/ico_hot_album.png
     * list : []
     */

    private String name;
    private String url;
    private String icon;
    private List[] list;

    public Album() {
    }

    public Album(String name, String url, String icon, List[] list) {
        this.name = name;
        this.url = url;
        this.icon = icon;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", list=" + Arrays.toString(list) +
                '}';
    }

    public List[] getList() {
        return list;
    }

    public void setList(List[] list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    private static class List {
        /**
         * Title : 葱油炒面
         * Cover : http://recipe1.hoto.cn/pic/recipe/g_230/f5/bf/966645_1a026f.jpg
         */

        private String Title;
        private String Cover;

        public List() {
        }

        public List(String title, String cover) {
            Title = title;
            Cover = cover;
        }

        @Override
        public String toString() {
            return "List{" +
                    "Title='" + Title + '\'' +
                    ", Cover='" + Cover + '\'' +
                    '}';
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getCover() {
            return Cover;
        }

        public void setCover(String Cover) {
            this.Cover = Cover;
        }
    }
}
