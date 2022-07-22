package com.yizhifu.springboot.service;

import com.yizhifu.springboot.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> selectAll();
}
