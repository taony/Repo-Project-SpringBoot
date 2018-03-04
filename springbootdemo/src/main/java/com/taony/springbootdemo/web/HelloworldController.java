package com.taony.springbootdemo.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class HelloworldController {

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("name","taony");
        return "hello";
    }

}
