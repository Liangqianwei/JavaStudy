package com.yizhifu.springbootdemo.controller;

import com.yizhifu.springbootdemo.Util.JSONResult;
import com.yizhifu.springbootdemo.entity.User;
import com.yizhifu.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/getLoginPage")
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JSONResult login(String name, String password, HttpSession session){
        User user = iUserService.login(name,password);
        if(user == null){
            return new JSONResult(JSONResult.ERROR,"用户名密码错误");
        }
        session.setAttribute("user",user);
        return new JSONResult(JSONResult.OK,"登录成功");
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/user/getLoginPage";
    }
}
