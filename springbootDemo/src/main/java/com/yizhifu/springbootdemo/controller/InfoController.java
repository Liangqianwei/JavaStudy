package com.yizhifu.springbootdemo.controller;

import com.yizhifu.springbootdemo.Util.JSONResult;
import com.yizhifu.springbootdemo.entity.Info;
import com.yizhifu.springbootdemo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Info")
public class InfoController {
    @Autowired
    private InfoService infoService ;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        System.out.println("InfoController.selectAll");
        List<Info> list = infoService.selectAll();
        model.addAttribute("list",list);
        for (Info info : list) {
            System.out.println(info.toString());
        }
        return "info_list";
    }

    @RequestMapping("/selectOne")
    @ResponseBody
    public String selectOne(Model model){
        System.out.println("InfoController");
        Info info = infoService.selectOne();
        model.addAttribute("info",info);
        System.out.println(info);
        return info.toString();
    }

    @RequestMapping("/getInfoAddPage")
    public String getInfoAddPage(){
        return "info_add";
    }

    @RequestMapping("/add")
    @ResponseBody
    public JSONResult add(Info info){
        System.out.println("InfoController.add");
        System.out.println("InfoController:add"+info);
        return infoService.add(info);
    }

    @RequestMapping("/deleteById")
    public String deleteById(Integer id){
        System.out.println("InfoController.deleteById");
        infoService.deleteById(id);
        return "redirect:/Info/selectAll";
    }

    @RequestMapping("/getInfoUpdateById")
    public String getInfoUpdateById(Integer id,Model model){
        Info info = infoService.selectById(id);
        model.addAttribute("info",info);
        return "info_update";
    }

    @RequestMapping("/update")
    @ResponseBody
    public JSONResult update(Info info){
        System.out.println("InfoController:update:"+info);
        return infoService.update(info);
    }
}
