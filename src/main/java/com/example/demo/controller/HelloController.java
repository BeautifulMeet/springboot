package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: Chen
 * @create: 2019-03-13 00:23
 **/
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello springboot,"+ new Date();
    }

}
