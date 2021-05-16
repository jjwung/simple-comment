package com.jj.comment.entity;

import lombok.Data;

@Data
public class User {
    // 主键自增
    private String id;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 邮箱
    private String email;

    // 手机号
    private String phone;

    // 验证码
    private String verifyCode;

    // 昵称
    private String nickname;
}
