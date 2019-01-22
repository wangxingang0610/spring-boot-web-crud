package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {


    @RequestMapping("/success")
    public String success(Map<String,Object> maps){

        maps.put("hello","<h1>你好</h1>");
        maps.put("users", Arrays.asList("aa","bb","cc"));

        return "success";
    }

}
