package com.weibo.square.bean.douban;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Tag {
    /**
     * CateId : 1004
     * CateName : 寿司
     * Url : haodourecipe://haodou.com/recipe/tag/?id=1004&name=%E5%AF%BF%E5%8F%B8
     * Cover : http://recipe0.hoto.cn/pic/recipe/l/5e/ad/372062_259012.jpg
     * HasVideo : 0
     * OpenUrl : haodourecipe://haodou.com/recipe/info/?id=372062&video=0
     */

    private int CateId;
    private String CateName;
    private String Url;
    private String Cover;
    private int HasVideo;
    private String OpenUrl;

    public Tag() {
    }

    public Tag(int cateId, String cateName, String url, String cover, int hasVideo, String openUrl) {
        CateId = cateId;
        CateName = cateName;
        Url = url;
        Cover = cover;
        HasVideo = hasVideo;
        OpenUrl = openUrl;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "CateId=" + CateId +
                ", CateName='" + CateName + '\'' +
                ", Url='" + Url + '\'' +
                ", Cover='" + Cover + '\'' +
                ", HasVideo=" + HasVideo +
                ", OpenUrl='" + OpenUrl + '\'' +
                '}';
    }

    public int getCateId() {
        return CateId;
    }

    public void setCateId(int CateId) {
        this.CateId = CateId;
    }

    public String getCateName() {
        return CateName;
    }

    public void setCateName(String CateName) {
        this.CateName = CateName;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getCover() {
        return Cover;
    }

    public void setCover(String Cover) {
        this.Cover = Cover;
    }

    public int getHasVideo() {
        return HasVideo;
    }

    public void setHasVideo(int HasVideo) {
        this.HasVideo = HasVideo;
    }

    public String getOpenUrl() {
        return OpenUrl;
    }

    public void setOpenUrl(String OpenUrl) {
        this.OpenUrl = OpenUrl;
    }
}
