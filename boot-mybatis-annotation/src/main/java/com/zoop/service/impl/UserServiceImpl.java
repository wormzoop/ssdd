package com.zoop.service.impl;

import com.zoop.entity.User;
import com.zoop.mapper.UserMapper;
import com.zoop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017\8\1 0001.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userlist() {
        try{
            System.out.print("userMapper--------------: "+userMapper);
            return userMapper.findAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
