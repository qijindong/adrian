package com.tencent.show.service;

import com.tencent.show.dao.NewsDao;
import com.tencent.show.dao.NewsDaoImpl;
import com.tencent.show.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by v_jdqi on 2016/8/31 0031.
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> findAllNews() {
        return newsDao.findAll();
    }

    @Override
    public void updateNews(News news) {
        newsDao.updateNews(news);
    }

    @Override
    public void addNews(News news) {
        newsDao.addNews(news);
    }

    @Override
    public boolean nullNews(News news) {
        return newsDao.nullNews(news.getNews_id(), news.getLike_news_id(), news.getStatis_time());
    }

    @Override
    public News findOneNews(String news_id, String like_news_id, String statis_time) {
        return newsDao.searchNews(news_id,like_news_id,statis_time);
    }
}
