package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 Controller
 *
 * @author 郑智国 (zhiguo.zheng@ucarinc.com)
 * @time 2019/4/24 17:54
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String testHello() {
        return "Hello Spring Boot!";
    }
}
