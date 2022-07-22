package com.yizhifu.springbootdemo.service.impl;

import com.yizhifu.springbootdemo.Util.JSONResult;
import com.yizhifu.springbootdemo.entity.Info;
import com.yizhifu.springbootdemo.mapper.InfoMapper;
import com.yizhifu.springbootdemo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public void deleteById(Integer id) {
        infoMapper.deleteById(id);
        //return JSONResult.ok("删除成功");
    }

    @Override
    public JSONResult add(Info info) {
        infoMapper.add(info);
        return JSONResult.ok("添加成功");
    }

    @Override
    public List<Info> selectAll() {
        return infoMapper.selectAll();
    }

    @Override
    public Info selectOne() {
        return infoMapper.selectOne();
    }

    @Override
    public Info selectById(Integer id) {
        return infoMapper.selectById(id);
    }

    @Override
    public JSONResult update(Info info) {
        infoMapper.update(info);
        return JSONResult.ok("修改成功");
    }
}
