package com.atguigu.controller;

import com.atguigu.domain.Person;
import com.atguigu.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class DemoController {

    @Resource
    private Person person;

    @Resource
    private User user;

    @RequestMapping("/findPerson")
    public Person findPerson(){
        log.info("进入了findPerson");
        return person;
    }


    @RequestMapping("/findUser")
    public User findUser(){
        return user;
    }

}
