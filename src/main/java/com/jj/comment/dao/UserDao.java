package com.jj.comment.dao;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    // 查询用户名
    String findUsername(@Param("username") String username);

    // 添加用户
    boolean addUser(@Param("user") User user);
}
