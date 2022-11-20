package com.hp.boot.config;

import com.hp.boot.controller.UserController;
import com.hp.boot.interception.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
@Slf4j
public class WebConfig implements WebMvcConfigurer {

    @Resource
    private LoginInterceptor interceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns("/","/login","/main","/css/**","/fonts/**","/images/**","/js/**");
    }

    @Autowired
    public void m1(UserController userController){
        log.info("进入m1方法，参数是：" + userController);
    }
}
