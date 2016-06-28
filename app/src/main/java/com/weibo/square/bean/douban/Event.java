package com.weibo.square.bean.douban;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Event {

    /**
     * name : 热门活动
     * icon : http://www.haodou.com/public/images3/ico_hots_activity.png
     * url : haodourecipe://haodou.com/latestactive/official/
     * list : []
     */

    private String name;
    private String icon;
    private String url;
    private Recommed.List[] list;

    public Event() {
    }

    public Event(String name, String icon, String url, Recommed.List[] list) {
        this.name = name;
        this.icon = icon;
        this.url = url;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", list=" + Arrays.toString(list) +
                '}';
    }

    public Recommed.List[] getList() {
        return list;
    }

    public void setList(Recommed.List[] list) {
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
