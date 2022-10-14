package com.atguigu.config;

import com.atguigu.domain.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(User.class)
public class WebConfig {

/*
    @Bean
    public User user(){
        return new User();
    }

    @Bean
    @ConditionalOnBean(name = "user")
    public Person person(){
        return new Person("Yuno","18");
    }

*/



}
