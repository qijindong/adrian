package com.tencent.show.dao;

import com.tencent.show.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by v_jdqi on 2016/8/30 0030.
 */
@Repository
public class NewsDaoImpl implements NewsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addNews(News news) {
        String sql = "insert into news values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, news.getStatis_time(), news.getNews_id(),
                news.getLike_news_id(), news.getOnline_point(), news.getOnline_type(), news.getPoint(), news.getMade_point());
    }

    @Override
    public void deleteNews(String news_id) {
        String sql = "delete from news where news_id=?";
        jdbcTemplate.update(sql, news_id);
    }

    @Override
    public void updateNews(News news) {
        String sql = "update user set online_point=?,online_type=?,point=?,made_point=? where news_id=? and like_news_id=? and statis_time=? ";
        jdbcTemplate.update(sql,
                 news.getOnline_point(), news.getOnline_type(), news.getPoint(), news.getMade_point(), news.getNews_id(),news.getLike_news_id(),news.getStatis_time());
    }

    @Override
    public boolean nullNews(String news_id, String like_news_id, String statis_time) {
        String sql="select * from news where news_id=? and like_news_id=? and statis_time=?";
        if(jdbcTemplate.query(sql,new NewsRowMapper(),news_id,like_news_id,statis_time)==null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public News searchNews(String news_id, String like_news_id, String statis_time) {
        String sql="select * from news where news_id=? and like_news_id=? and statis_time=?";
        if(jdbcTemplate.query(sql,new NewsRowMapper(),news_id,like_news_id,statis_time)==null){
            return null;
        } else {
            return jdbcTemplate.queryForObject(sql, new NewsRowMapper(), news_id, like_news_id, statis_time);
        }
    }

    @Override
    public List<News> findAll() {
        String sql="select * from show_table.news";
        System.out.println("2222222222222222222-------"+jdbcTemplate);
        return jdbcTemplate.query(sql,new NewsRowMapper());
    }

    class NewsRowMapper implements RowMapper<News> {
        //rs为返回结果集，以每行为单位封装着
        public News mapRow(ResultSet rs, int rowNum) throws SQLException {
            System.out.println(rs);
            News news = new News();
            news.setStatis_time(rs.getString("statis_time"));
            news.setNews_id(rs.getString("news_id"));
            news.setLike_news_id(rs.getString("like_news_id"));
            news.setOnline_point(rs.getString("online_point"));
            news.setOnline_type(rs.getString("online_type"));
            news.setPoint(rs.getString("point"));
            news.setMade_point(rs.getString("made_point"));
            return news;
        }

    }
}
