package com.devnote.springmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.devnote.springmybatis.dao")
public class SpringMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringMybatisApplication.class, args);
    }

}
