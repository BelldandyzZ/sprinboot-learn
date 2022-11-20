package com.yuansikang.boot.mapper;

import com.yuansikang.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    int insertUser(User user);

    int deleteUserByUserId(@Param("id") String id);

    int updateUser(User user);

    List<User> selectUsers();
}
