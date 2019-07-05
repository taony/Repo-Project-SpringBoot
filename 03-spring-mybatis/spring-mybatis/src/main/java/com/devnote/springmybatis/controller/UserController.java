package com.devnote.springmybatis.controller;

import com.devnote.springmybatis.entity.User;
import com.devnote.springmybatis.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @description: TODO
 * @author: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-03-12 23:20
 */

@RestController
@EnableAutoConfiguration
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/user")
    public String getUser() {
        User user = User.builder().userId(UUID.randomUUID().toString().replace("-", "")).userName("zhangsan").build();
        userService.insert(user);
        return user.toString();
    }
}
