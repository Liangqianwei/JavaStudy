package com.yizhifu.springboot.mapper;

import com.yizhifu.springboot.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAll();
}
