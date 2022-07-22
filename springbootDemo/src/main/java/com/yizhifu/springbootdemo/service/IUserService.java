package com.yizhifu.springbootdemo.service;

import com.yizhifu.springbootdemo.entity.User;

public interface IUserService {
    User login(String name, String password);
}
