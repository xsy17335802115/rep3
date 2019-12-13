package com.com.controller;


import com.entity.Admin;
import com.service.inter.AdminInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class adminCon {

    @Autowired
    private AdminInt adminint;

    @RequestMapping("/check")
    public String test(Admin admin, Map<String,Object> map){
        System.out.println("执行");
        Admin fanhui=adminint.selectOne(admin);
        if(fanhui==null){
            return "success";
        }else{
            map.put("uname",fanhui.getAdminName());
            return "../../index";
        }

    }
}
