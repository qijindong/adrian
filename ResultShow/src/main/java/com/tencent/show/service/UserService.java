package com.tencent.show.service;

import com.tencent.show.dao.UserDao;
import com.tencent.show.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/28.
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean register(User user) {
        User u = userDao.findUserByUserName(user.getUsername());
        if(u.getId() == 0) {
            userDao.register(user);
            return true;
        }
        return false;
    }

    public boolean loginCheck(User user) {
        System.out.println(userDao);
        User u = userDao.findUserByUserName(user.getUsername());
        return user.getPassword().equals(u.getPassword());
    }
}
