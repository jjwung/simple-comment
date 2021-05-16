package com.jj.comment.dao;

import com.jj.comment.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    // 查询用户名
    String findUsername(@Param("username") String username);

    // 通过邮箱查询用户
    User findUserByEmail(@Param("email") String email);

    // 查询邮箱
    String findEmail(@Param("email") String email);

    // 添加用户
    boolean addUser(@Param("user") User user);

    // 更新用户
    void updatetUser(@Param("user") User user);

    // 通过用户名查询用户
    User findUserByName(@Param("username") String username);
}
