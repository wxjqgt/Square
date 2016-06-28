package com.weibo.square.bean.douban;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Person {

    /**
     * name : 猜你喜欢
     * icon : http://www.haodou.com/public/images3/ico_yourlove.png
     * url : haodourecipe://haodou.com/recommend/recipe/?keyword=%E7%8C%9C%E4%BD%A0%E5%96%9C%E6%AC%A2&title=%E7%8C%9C%E4%BD%A0%E5%96%9C%E6%AC%A2
     * tag : []
     * list : []
     */

    private String name;
    private String icon;
    private String url;
    private Tag[] tag;
    private List[] list;

    public Person() {
    }

    public Person(String name, String icon, String url, Tag[] tag, List[] list) {
        this.name = name;
        this.icon = icon;
        this.url = url;
        this.tag = tag;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", tag=" + Arrays.toString(tag) +
                ", list=" + Arrays.toString(list) +
                '}';
    }

    public Tag[] getTag() {
        return tag;
    }

    public void setTag(Tag[] tag) {
        this.tag = tag;
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
