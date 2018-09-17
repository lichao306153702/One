package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
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

    @RequestMapping("user")
    public List<User> userlist() {
        Wrapper<User> wrapper = new EntityWrapper<>();
        return userService.selectList(wrapper);
    }


    @RequestMapping("page")
    public Page<User> page() {
        Wrapper<User> wrapper = new EntityWrapper<>();

        wrapper.gt("id", new Integer(3));
        return userService.selectPage(new Page<>(), wrapper);
    }

    @RequestMapping("insert")
    public boolean insert() {

        User user = userService.selectById(9);
        if (user == null) {
            user = new User();
            user.setAge(18);
            user.setName("张三");
            user.setVersion(0);
            boolean b = userService.insert(user);
            System.out.println(b);
        }
        return false;

    }

}
