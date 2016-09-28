package com.tencent.show.dao;

import com.tencent.show.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by v_jdqi on 2016/8/30 0030.
 */
public interface NewsDao {
    public void addNews(News news);

    public void deleteNews(String news_id);

    public void updateNews(News news);

    public boolean nullNews(String news_id,String like_news_id,String statis_time);

    public News searchNews(String news_id,String like_news_id,String statis_time);

    public List<News> findAll();
}
