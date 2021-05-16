package com.jj.comment.service;

import com.jj.comment.dao.UserDao;
import com.jj.comment.entity.User;
import com.jj.comment.util.MailUtil;
import com.jj.comment.util.VerifyCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@Service
public class EmailService {
    @Autowired
    private UserDao userDao;

    public boolean verify(String email) {

        // 验证邮箱是否可用
        User userByEmail = userDao.findUserByEmail(email);
        if (userByEmail != null && StringUtils.isBlank(userByEmail.getUsername())) { // 可用
            String code = null;
            try {
                code = VerifyCode.generateNumberCode(6); // 6位数验证码
                MailUtil.sendMail(email, "赛博朋克验证码", "赛博朋克，您的验证码为<H3>" + code + "</H3>");
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            // 验证码存入数据库用来验证
            User user = userDao.findUserByEmail(email);
            if (user == null) { // 新增
                user = new User();
                user.setEmail(email);
                user.setVerifyCode(code);
                userDao.addUser(user);
            } else { // 更新
                user.setVerifyCode(code);
                userDao.updatetUser(user);
            }
            return true;
        } else { // 不可用
            return false;
        }
    }
}
