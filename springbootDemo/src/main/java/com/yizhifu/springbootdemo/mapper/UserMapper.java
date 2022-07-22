package com.yizhifu.springbootdemo.mapper;

import com.yizhifu.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param("name") String name, @Param("password") String password);
}
