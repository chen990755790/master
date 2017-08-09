package com.cc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/2.
 */
@RestController
public class HelloContrller {

    @GetMapping("/say")
    public String say(){
        return "hello world !";
    }
}
