package com.hp.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.hp.boot.servlet")
@SpringBootApplication
public class Chapter05Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter05Application.class,args);
    }

}
