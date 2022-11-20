package com.yuansikang.boot.contorller;

import com.yuansikang.boot.bean.User;
import com.yuansikang.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/findUser")
    public void findUser(){
        List<User> users = userService.queryUsers();
        for (User user : users) {
            log.info(user.toString());
        }
    }

    @RequestMapping("/addUser")
    public void addUser(User user){
        int res = userService.saveUser(user);
        log.info("保存的结果为：" + res);

    }

    @RequestMapping("/eraseUser")
    public void eraseUser(String id){
        int res = userService.removeUserByUserId(id);
        log.info("删除的结果为：" + res);
    }

    @RequestMapping("/editUser")
    public void editUser(User user){
        int res = userService.modifyUser(user);
        log.info("修改的结果为：" + res);
    }




}
