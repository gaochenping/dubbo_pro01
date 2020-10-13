package com.gcp.mapper.impl;

import com.gcp.mapper.UserMapper;
import com.gcp.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapperImpl implements UserMapper {
    @Override
    public void insert(User user) {
        System.out.println("数据库访问：新增用户 - " + user);
    }

    @Override
    public User selectById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("name" + id);
        user.setPassword("password" + id);
        System.out.println("数据库访问：主键查询用户 - " + user);
        return user;
    }
}
