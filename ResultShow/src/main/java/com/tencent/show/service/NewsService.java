package com.tencent.show.service;

import com.tencent.show.model.News;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by v_jdqi on 2016/8/31 0031.
 */
public interface NewsService {
    public List<News> findAllNews();

    public void updateNews(News news);

    public void addNews(News news);

    public boolean nullNews(News news);

    public News findOneNews(String news_id,String like_news_id,String statis_time);
}
