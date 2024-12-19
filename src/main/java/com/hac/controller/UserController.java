package com.hac.controller;

import com.hac.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hac
 * @date 2024/12/19 11:42
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {
    @GetMapping()
    public User user() {
        User user = new User(1L,"tom", 32);
        return user;
    }

    @GetMapping(value = "/test")
    public String test() {
        return "hi";
    }
}
