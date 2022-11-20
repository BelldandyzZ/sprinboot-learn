package com.hp.boot.controller;

import com.hp.boot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@Slf4j
@SessionAttributes("currentUser")
public class UserController {

    @GetMapping({"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/main")
    public String login(User user, Model model){
        if("Yuno".equals(user.getUsername()) && "123".equals(user.getPassword())){
            model.addAttribute("currentUser",user);
            return "redirect:/main.html";
        }
        else{
            return "redirect:/login";
        }
    }

    @GetMapping("/main.html")
    public String main(){
        return "index";
    }

    @Autowired
    public void c1(){
        log.info("进入从c1方法");
    }


}
