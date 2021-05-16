package com.jj.comment.service;

import com.jj.comment.dao.UserDao;
import com.jj.comment.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean signUp(User user) {
        User userByEmail = userDao.findUserByEmail(user.getEmail());

        // 为空则注册
        if (userByEmail == null) {
            if (StringUtils.equals(user.getVerifyCode(), userByEmail.getVerifyCode())) { // 验证码判定成功，注册
                return userDao.addUser(user);
            }
        }

        return false;
    }
}
