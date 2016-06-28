package com.weibo.square.bean.douban;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Vip {

    /**
     * name : 好豆达人
     * icon : http://www.haodou.com/public/images3/ico_auxiliary_master.png
     * list : []
     * url : haodourecipe://haodou.com/vipuser/
     */

    private String name;
    private String icon;
    private String url;
    private List[] list;

    public Vip() {
    }

    public Vip(String name, String icon, String url, List[] list) {
        this.name = name;
        this.icon = icon;
        this.url = url;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
