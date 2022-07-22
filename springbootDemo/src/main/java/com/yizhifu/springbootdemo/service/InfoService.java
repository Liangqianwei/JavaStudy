package com.yizhifu.springbootdemo.service;

import com.yizhifu.springbootdemo.Util.JSONResult;
import com.yizhifu.springbootdemo.entity.Info;

import java.util.List;

public interface InfoService {
    void deleteById(Integer id);

    JSONResult add(Info info);

    List<Info> selectAll();

    Info selectOne();

    Info selectById(Integer id);

    JSONResult update(Info info);
}
