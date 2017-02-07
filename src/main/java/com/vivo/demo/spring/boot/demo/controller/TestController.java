package com.vivo.demo.spring.boot.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivo.demo.spring.boot.demo.constant.HttpConstant;
import com.vivo.demo.spring.boot.demo.util.MessageHandleUtil;

@RestController
@EnableAutoConfiguration
public class TestController {
    
    @RequestMapping(value = "/", produces = HttpConstant.APPLICATION_JSON)
    String hello() {
        return MessageHandleUtil.buildSuccessResult();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(TestController.class, args);
    }
}
