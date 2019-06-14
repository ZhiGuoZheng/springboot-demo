package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试 Controller
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2019/4/24 17:54
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public void testHello(Model model) {
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ">>>>>" + value);
        }
    }
}
