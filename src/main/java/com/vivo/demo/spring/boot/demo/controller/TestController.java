package com.vivo.demo.spring.boot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivo.demo.spring.boot.demo.constant.HttpConstant;
import com.vivo.demo.spring.boot.demo.util.MessageHandleUtil;

@RestController
@EnableAutoConfiguration
public class TestController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    
    @RequestMapping(value = "/", produces = HttpConstant.APPLICATION_JSON)
    String hello() {
        LOGGER.info("HELLO WORLD!!!");
        return MessageHandleUtil.buildSuccessResult();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(TestController.class, args);
    }
}
