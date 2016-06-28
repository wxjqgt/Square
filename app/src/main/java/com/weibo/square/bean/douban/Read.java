package com.weibo.square.bean.douban;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Read {

    /**
     * name : 精品阅读
     * icon : http://www.haodou.com/public/images3/ico_quality_goods.png
     * url : haodourecipe://haodou.com/reading/list/
     * list : []
     * Count : 3
     */

    private String name;
    private String icon;
    private String url;
    private int Count;
    private Recommed.List[] list;

    public Read() {
    }

    public Read(String name, String icon, String url, int count, Recommed.List[] list) {
        this.name = name;
        this.icon = icon;
        this.url = url;
        Count = count;
        this.list = list;
    }

    public List[] getList() {
        return list;
    }

    public void setList(Recommed.List[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Read{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", Count=" + Count +
                ", list=" + Arrays.toString(list) +
                '}';
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

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
}
