//package com.example.demo.config;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.json.GsonHttpMessageConverter;
//
//import java.lang.reflect.Modifier;
//
///**
// * 提供一个自定义的 GsonHttpMessageConvertor 实例
// *
// * @author 郑智国 (zhiguo.zheng@ucarinc.com)
// * @time 2019/4/30 9:25
// */
//@Configuration
//public class GsonConfig {
//
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter() {
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        GsonBuilder builder = new GsonBuilder();
//
//        // 设置 Gson 解析时日期的格式
//        builder.setDateFormat("yyyy-MM-dd");
//        // 设置 Gson 解析时修饰符为 protected 的字段被过滤掉
//        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
//
//        // 创建 Gson 对象放入 GsonHttpMessageConverter 的实例中并返回 converter
//        Gson gson = builder.create();
//        converter.setGson(gson);
//        return converter;
//    }
//
//}
