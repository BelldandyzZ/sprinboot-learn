package com.atguigu;

import com.atguigu.config.WebConfig;
import com.atguigu.domain.Person;
import com.atguigu.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication02 {

    public static void main(String[] args) {

        ConfigurableApplicationContext app = SpringApplication.run(MainApplication02.class, args);

        WebConfig webConfig = app.getBean("webConfig",WebConfig.class);

        System.out.println("webConfig = " + webConfig);

        Person p1 = app.getBean("person", Person.class);
        Person p2 = app.getBean("person", Person.class);

        System.out.println("p2 = p1 : " + (p2 == p1));

        System.out.println("============================");
        System.out.println("============================");

        User bean = app.getBean(User.class);
        System.out.println("bean = " + bean);
    }
}
