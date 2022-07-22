package com.yizhifu.springboot.service;

import com.yizhifu.springboot.entity.User;

public interface IUserService {

    User login(String name,String password);
}
