package com.atguigu.controller;

import com.atguigu.domain.Person;
import com.atguigu.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Resource
    private Person person;

    @Resource
    private User user;

    @RequestMapping("/findPerson")
    public Person findPerson(){
        return person;
    }


    @RequestMapping("/findUser")
    public User findUser(){
        return user;
    }

}
