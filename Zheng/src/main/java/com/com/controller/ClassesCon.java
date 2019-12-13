package com.com.controller;

import com.entity.Classes;
import com.service.impl.ClassesImpl;
import com.service.inter.ClassesInt;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class ClassesCon {


    @Autowired
    private ClassesInt classesInt;
//   根据类型自动获取接口
//   接口会去找自己的实现类

    @RequestMapping("/hello1")
    public String test(Map<String,Object> map){
        System.out.println("哈哈哈！");
        List<Classes> list=classesInt.selectAll(new RowBounds(2,5));
        for(Classes classes:list){
            System.out.println(classes);
        }
        map.put("list",list);
        return "list";
    }

    @RequestMapping("/hello2")
    public String test1(Classes cc){
        System.out.println(cc);
        classesInt.insert(cc);
        return "redirect:hello1.do";
        /*可以返回一个请求    但必须加转发或者重定向*/
    }

    @RequestMapping("/hello3")
    public String test2(){
        System.out.println("方法三");
        return "success";
    }


}
