package com.tencent.show.test;

import static com.sun.deploy.security.ruleset.DRSResult.Type.RUN;

import com.tencent.show.model.News;
import com.tencent.show.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v_jdqi on 2016/9/7 0007.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/springmvc-servlet.xml")
public class NewsServiceTest {
    @Autowired
    private NewsService newsService;
    @Test
    public void test(){
        List<News> newsList=new ArrayList<News>();
        newsList=newsService.findAllNews();
        System.out.println(newsList);
    }
}
