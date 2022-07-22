package com.yizhifu.springboot.mapper;

import com.yizhifu.springboot.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param("name") String name,@Param("password") String password);
}
