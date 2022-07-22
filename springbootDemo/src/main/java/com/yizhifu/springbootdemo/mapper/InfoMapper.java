package com.yizhifu.springbootdemo.mapper;

import com.yizhifu.springbootdemo.entity.Info;

import java.util.List;

public interface InfoMapper {
    List<Info> selectAll();

    Info selectOne();

    void add(Info info);

    void deleteById(Integer id);

    Info selectById(Integer id);

    void update(Info info);
}
