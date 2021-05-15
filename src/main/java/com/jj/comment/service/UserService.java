package com.jj.comment.service;

import com.jj.comment.dao.UserDao;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean signUp(User user) {
        String username = userDao.findUsername(user.getUsername());

        // 为空则注册
        if (username.isBlank()) {
            return userDao.addUser(user);
        }

        return false;
    }
}
