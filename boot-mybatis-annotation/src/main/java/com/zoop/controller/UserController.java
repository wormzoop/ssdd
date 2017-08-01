package com.zoop.controller;

import com.zoop.entity.User;
import com.zoop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017\8\1 0001.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userlist")
    @ResponseBody
    public List<User> userlist(){
        List<User> list = userService.userlist();
        System.out.println(list);
        return list;
    }

}
