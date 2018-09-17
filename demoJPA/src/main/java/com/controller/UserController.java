package com.controller;


import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public List<User> listUser(){

        return userService.findList();
    }
}
