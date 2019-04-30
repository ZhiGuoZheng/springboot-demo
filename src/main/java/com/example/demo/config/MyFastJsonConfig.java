package com.example.demo.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 提供一个自定以的 FastJsonHttpMessageConverter
 *
 * @author 郑智国 (zhiguo.zheng@ucarinc.com)
 * @time 2019/4/30 9:54
 */
@Configuration
public class MyFastJsonConfig {

    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();

        // 设置日期格式
        config.setDateFormat("yyyy-MM-dd");
        // 设置数据编码
        config.setCharset(Charset.forName("UTF-8"));

        config.setSerializerFeatures(
                // 在生成的 Json 中输出类名
                SerializerFeature.WriteClassName,
                // 输出 value 为 NULL 的数据
                SerializerFeature.WriteMapNullValue,
                // 生成的 Json 格式化
                SerializerFeature.PrettyFormat,
                // 空集合输出 []
                SerializerFeature.WriteNullListAsEmpty,
                // 空字符串输出 ""
                SerializerFeature.WriteNullStringAsEmpty
        );
        converter.setFastJsonConfig(config);

        // 用户必须自己配置 MediaType
        List<MediaType> supportMediaTypes = new ArrayList<>();
        supportMediaTypes.add(MediaType.APPLICATION_JSON);
        supportMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        supportMediaTypes.add(MediaType.APPLICATION_ATOM_XML);
        supportMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
        supportMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
        supportMediaTypes.add(MediaType.APPLICATION_PDF);
        supportMediaTypes.add(MediaType.APPLICATION_RSS_XML);
        supportMediaTypes.add(MediaType.APPLICATION_XHTML_XML);
        supportMediaTypes.add(MediaType.APPLICATION_XML);
        supportMediaTypes.add(MediaType.IMAGE_GIF);
        supportMediaTypes.add(MediaType.IMAGE_JPEG);
        supportMediaTypes.add(MediaType.IMAGE_PNG);
        supportMediaTypes.add(MediaType.TEXT_EVENT_STREAM);
        supportMediaTypes.add(MediaType.TEXT_HTML);
        supportMediaTypes.add(MediaType.TEXT_MARKDOWN);
        supportMediaTypes.add(MediaType.TEXT_PLAIN);
        supportMediaTypes.add(MediaType.TEXT_XML);

        converter.setSupportedMediaTypes(supportMediaTypes);

        return converter;
    }

}
