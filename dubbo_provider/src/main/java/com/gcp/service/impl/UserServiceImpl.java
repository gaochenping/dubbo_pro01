package com.gcp.service.impl;

import com.gcp.mapper.UserMapper;
import com.gcp.pojo.User;
import com.gcp.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(loadbalance = "roundrobin")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        System.out.println("UserService 实现类中：注册用户");
        userMapper.insert(user);
    }

    @Override
    public User getUserById(Long id) {
        System.out.println("UserService 实现类中：根据id查询用户");
        return userMapper.selectById(id);
    }
}
