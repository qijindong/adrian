package com.tencent.show.model;

import java.io.Serializable;

/**
 * Created by v_jdqi on 2016/9/8 0008.
 */
public class OnlineNews implements Serializable{
    private int statis_time;
    private String news_id;
    private  String like_news_id;
    private  String point;
    private  String type;

    public int getStatis_time() {
        return statis_time;
    }

    public void setStatis_time(int statis_time) {
        this.statis_time = statis_time;
    }

    public String getNews_id() {
        return news_id;
    }

    public void setNews_id(String news_id) {
        this.news_id = news_id;
    }

    public String getLike_news_id() {
        return like_news_id;
    }

    public void setLike_news_id(String like_news_id) {
        this.like_news_id = like_news_id;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
