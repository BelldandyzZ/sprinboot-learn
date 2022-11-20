package com.yuansikang.boot.service;

import com.yuansikang.boot.bean.User;

import java.util.List;

public interface UserService {

    int saveUser(User user);

    int removeUserByUserId(String id);

    int modifyUser(User user);

    List<User> queryUsers();


}
