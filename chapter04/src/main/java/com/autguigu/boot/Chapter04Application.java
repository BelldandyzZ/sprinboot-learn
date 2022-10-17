package com.autguigu.boot;

import com.autguigu.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Chapter04Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(Chapter04Application.class, args);

        Person person = app.getBean("person", Person.class);
        System.out.println("person = " + person);

    }

}
