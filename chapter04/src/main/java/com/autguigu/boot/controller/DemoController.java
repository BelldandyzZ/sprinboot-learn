package com.autguigu.boot.controller;


import com.autguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Person person;

    @RequestMapping("/demo123")
    public Person demo(){
        return person;
    }

}
