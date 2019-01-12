package com.answer.controller;

import com.answer.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/12 20 12
 */
@RestController
public class UserController {

    @Autowired
    User user;

    @RequestMapping("/user")
    public String user() {
        return "name:" + user.getName() + ", age:" + user.getAge() + ", city:" + user.getCity() + ", country:" + user.getCountry();
    }
}
