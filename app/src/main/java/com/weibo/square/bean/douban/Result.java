package com.weibo.square.bean.douban;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Result {
    /**
     * "recipe": {},
     "tools": {},
     "album": {},
     "person": {},
     "recommed": {},
     "goods": {},
     "read": {},
     "event": {},
     "vip": {},
     "publish": {}
     */
    private Recipe recipe;
    private Tools tools;
    private Album album;
    private Person person;
    private Recommed recommed;
    private Goods goods;
    private Read read;
    private Event event;
    private Vip vip;
    private Publish publish;

    public Result() {}

    public Result(Recipe recipe, Tools tools, Album album, Person person, Recommed recommed, Goods goods, Read read, Event event, Vip vip, Publish publish) {
        this.recipe = recipe;
        this.tools = tools;
        this.album = album;
        this.person = person;
        this.recommed = recommed;
        this.goods = goods;
        this.read = read;
        this.event = event;
        this.vip = vip;
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Result{" +
                "recipe=" + recipe +
                ", tools=" + tools +
                ", album=" + album +
                ", person=" + person +
                ", recommed=" + recommed +
                ", goods=" + goods +
                ", read=" + read +
                ", event=" + event +
                ", vip=" + vip +
                ", publish=" + publish +
                '}';
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Tools getTools() {
        return tools;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Recommed getRecommed() {
        return recommed;
    }

    public void setRecommed(Recommed recommed) {
        this.recommed = recommed;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Read getRead() {
        return read;
    }

    public void setRead(Read read) {
        this.read = read;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Vip getVip() {
        return vip;
    }

    public void setVip(Vip vip) {
        this.vip = vip;
    }

    public Publish getPublish() {
        return publish;
    }

    public void setPublish(Publish publish) {
        this.publish = publish;
    }
}
