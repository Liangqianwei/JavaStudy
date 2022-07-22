package com.yizhifu.springboot.service.impl;

import com.yizhifu.springboot.entity.Student;
import com.yizhifu.springboot.mapper.StudentMapper;
import com.yizhifu.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    //注入过来mapper
    @Autowired
    private StudentMapper studentMapper ;
    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
