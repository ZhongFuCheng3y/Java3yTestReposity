package com.controller;

import com.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/age")
    public User getAge() {

        User user = new User();
        user.setAge("88");

        return user;
    }
}
