package com.yizhifu.springboot.service.impl;

import com.yizhifu.springboot.entity.User;
import com.yizhifu.springboot.mapper.UserMapper;
import com.yizhifu.springboot.service.IUserService;
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
