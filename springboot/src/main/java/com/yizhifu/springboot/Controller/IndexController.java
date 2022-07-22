package com.yizhifu.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //设置项目的默认页
    //http://localhost:8080/
    //如果是80端口，则端口号可以不用写 http://localhost
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
