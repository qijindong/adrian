package com.tencent.show.controller;

import com.tencent.show.model.News;
import com.tencent.show.service.NewsService;
import com.tencent.show.service.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by v_jdqi on 2016/8/31 0031.
 */
@Controller
@RequestMapping(value = "/")
public class NewsController {
    @Autowired
    private NewsServiceImpl newsService;

    @RequestMapping(value = "/showAll")
    public ModelAndView showAll() {
        System.out.println("1111111111111111111111");
        ModelAndView mav = new ModelAndView();
        System.out.println("1111111111" + mav);
        List<News> news = newsService.findAllNews();
        for (News a : news) {
            System.out.println(a.getNews_id());
        }
        System.out.println("222222222" + news);
        mav.setViewName("showAll.jsp");
        mav.addObject("news", news);
        System.out.println("222222222" + mav);
        return mav;
    }

    @RequestMapping(value = "/newsAdd")
    public ModelAndView newsAdd(News news) {
        ModelAndView mav = new ModelAndView();
        System.out.println(news.getNews_id() + news.getLike_news_id());
        if (newsService.nullNews(news) == false) {
            newsService.addNews(news);
            mav.setViewName("newsAdd.jsp");
            mav.addObject("errorMsg", "添加成功");
        } else {
            mav.setViewName("newsAdd.jsp");
            mav.addObject("errorMsg", "添加失败");
        }
        return mav;
    }

    @RequestMapping(value = "/newsUpdateBefore")
    public ModelAndView newsUpdateBefore(String news_id, String like_news_id, String statis_time) {
        ModelAndView mav = new ModelAndView();
        System.out.println(news_id);
        News news = newsService.findOneNews(news_id, like_news_id, statis_time);
        mav.addObject("news", news);
        mav.setViewName("newsUpdate.jsp");
        return mav;

    }
    @RequestMapping(value = "/newsUpdate")
    public ModelAndView newsUpdate(News news){
        ModelAndView mav=new ModelAndView();
        System.out.println(news.getNews_id() + news.getLike_news_id());
        newsService.updateNews(news);
        mav.setViewName("newsUpdate.jsp");
        mav.addObject("errorMsg", "修改成功");
        return mav;

    }

}
