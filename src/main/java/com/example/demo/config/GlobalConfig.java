package com.example.demo.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * 添加全局数据
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2019/5/8 19:07
 */

@ControllerAdvice
public class GlobalConfig {

    @ModelAttribute(value = "info")
    public Map<String, String> userInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("username", "罗贯中");
        map.put("gender", "男");
        return map;
    }

    @InitBinder("s")
    public void initSimpleBook(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("s.");
    }

    @InitBinder("a")
    public void initAuthor(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }
}
