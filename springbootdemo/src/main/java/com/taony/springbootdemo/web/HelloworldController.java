package com.taony.springbootdemo.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloworldController {

    @RequestMapping("/hello")
    public String index() {
        System.out.print("Hello");
        return "Helloworld";
    }

}
