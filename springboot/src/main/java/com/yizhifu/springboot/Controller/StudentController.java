package com.yizhifu.springboot.Controller;

import com.yizhifu.springboot.entity.Student;
import com.yizhifu.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;



    @RequestMapping("/selectAll2")
    @ResponseBody //将java对象转为json格式的数据。用来返回json
    public List<Student> selectAll2(){
        System.out.println("StudentController.selectAll");
        /*List<Student> list = new ArrayList<>();
        Student student1 = new Student(1,"zgf",12,"男");
        Student student2 = new Student(2,"zgdfg",12,"男");
        Student student3 = new Student(3,"zdfggf",12,"男");
        Student student4 = new Student(4,"zsavgf",14,"女");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);*/
        List<Student> list = studentService.selectAll();
        return list;

    }

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        System.out.println("StudentController.selectAll");
        List<Student> list = studentService.selectAll();
        model.addAttribute("list",list);

        //浏览器不能直接访问WEB-INF SpringBoot规定只能将jsp放在WEB-INF下边进行转发访问
        //return "/WEB-INF/student_list.jsp";
        return "student_list";

    }
    @RequestMapping("/getStudentAddPage")
    public String getStudentAddPage(){
        return "student_add";
    }
}
