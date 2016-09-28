package com.tencent.show.model;

import java.io.Serializable;

/**
 * Created by v_jdqi on 2016/8/30 0030.
 */
public class News implements Serializable{
    private String statis_time;
    private String news_id;
    private String like_news_id;
    private String online_point;
    private String online_type;
    private String point;
    private String made_point;

    public String getStatis_time() {
        return statis_time;
    }

    public void setStatis_time(String statis_time) {
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

    public String getOnline_point() {
        return online_point;
    }

    public void setOnline_point(String online_point) {
        this.online_point = online_point;
    }

    public String getOnline_type() {
        return online_type;
    }

    public void setOnline_type(String online_type) {
        this.online_type = online_type;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getMade_point() {
        return made_point;
    }

    public void setMade_point(String made_point) {
        this.made_point = made_point;
    }
}
