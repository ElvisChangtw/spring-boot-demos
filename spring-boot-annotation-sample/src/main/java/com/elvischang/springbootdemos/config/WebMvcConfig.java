package com.elvischang.springbootdemos.config;

import com.elvischang.springbootdemos.interceptor.ResponseResultInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author elvischang
 * @create 2022-09-17-下午 03:15
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Autowired
    ResponseResultInterceptor responseResultInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截器
        registry.addInterceptor(responseResultInterceptor);
    }

}
