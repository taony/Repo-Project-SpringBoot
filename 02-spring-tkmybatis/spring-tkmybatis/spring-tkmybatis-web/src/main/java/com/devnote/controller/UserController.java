package com.devnote.controller;

import com.devnote.entity.UserDO;
import com.devnote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description: TODO
 * @author: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-03-12 23:01
 */
@Controller
public class UserController {


    @ResponseBody
    @RequestMapping("/home")
    public String home() {

        return "home";

       /* UserDO user = new UserDO();
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        int i = userService.insert(user);
        return i + "";*/
    }

}
