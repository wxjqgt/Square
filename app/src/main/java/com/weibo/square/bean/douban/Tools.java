package com.weibo.square.bean.douban;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Tools {

    private List[] list;

    public Tools() {
    }

    public Tools(List[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "list=" + list +
                '}';
    }

    public List[] getList() {
        return list;
    }

    public void setList(List[] list) {
        this.list = list;
    }
}
