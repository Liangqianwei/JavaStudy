package com.yizhifu.springbootdemo.service.impl;

import com.yizhifu.springbootdemo.entity.User;
import com.yizhifu.springbootdemo.mapper.UserMapper;
import com.yizhifu.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        return userMapper.login(name,password);
    }
}
