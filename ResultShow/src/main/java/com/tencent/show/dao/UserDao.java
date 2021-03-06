package com.tencent.show.dao;

import com.tencent.show.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/8/28.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void register(User user){
        String sql="insert into user(username, password) values(?, ?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword());
    }
    public  User findUserByUserName(String userName){
        String sql ="select id, username, password from user where username=?";
        final User user = new User();
        System.out.println(jdbcTemplate);
        jdbcTemplate.query(sql, new Object[]{userName}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
        });
        return user;
    }
}
