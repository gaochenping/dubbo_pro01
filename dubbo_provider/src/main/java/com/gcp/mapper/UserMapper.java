package com.gcp.mapper;

import com.gcp.pojo.User;

/**
 * 模拟数据库访问
 */
public interface UserMapper {
    void insert(User user);
    User selectById(Long id);
}

