package com.autguigu.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/demo123")
    public String demo(){
        return "this is demo";
    }

}
