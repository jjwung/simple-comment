package com.jj.comment.service;

import com.jj.comment.util.MailUtil;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@Service
public class EmailService {
    public boolean verify(String email) {
//        boolean send = EmailUtils.send();
        try {
            MailUtil.sendMail(email, "赛博朋克验证码","<H3>邮件测试功能</H3>");
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return true;
    }
}
