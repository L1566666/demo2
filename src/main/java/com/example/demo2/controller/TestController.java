package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: lin
 * @Date: 2020/1/2 9:39
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public String test(){

        System.out.println("进入后台");
        return "访问成功";

    }


}
