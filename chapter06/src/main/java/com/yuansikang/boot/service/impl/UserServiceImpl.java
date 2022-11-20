package com.yuansikang.boot.service.impl;

import com.yuansikang.boot.bean.User;
import com.yuansikang.boot.mapper.UserMapper;
import com.yuansikang.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int removeUserByUserId(String id) {
        return userMapper.deleteUserByUserId(id);
    }

    @Override
    public int modifyUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<User> queryUsers() {
        return userMapper.selectUsers();
    }
}
