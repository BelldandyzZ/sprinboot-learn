package com.atguigu;

import com.atguigu.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication01 {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(MainApplication01.class, args);

        Person person = app.getBean(Person.class);

        System.out.println("person = " + person);





    }
}
