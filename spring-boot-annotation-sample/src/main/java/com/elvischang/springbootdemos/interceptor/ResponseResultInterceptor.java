package com.elvischang.springbootdemos.interceptor;

import com.elvischang.springbootdemos.annotation.ResponseResult;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author elvischang
 * @create 2022-09-17-下午 02:47
 **/
@Component
public class ResponseResultInterceptor implements HandlerInterceptor {

    public static final String RESPONSE_ANNOTATION = "RESPONSE_ANNOTATION";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (handler instanceof HandlerMethod) {
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Class<?> clazz = handlerMethod.getBeanType();
            final Method method = handlerMethod.getMethod();
            if (clazz.isAnnotationPresent(ResponseResult.class)) {
                request.setAttribute(RESPONSE_ANNOTATION, clazz.getAnnotation(ResponseResult.class));
            } else if (method.isAnnotationPresent(ResponseResult.class)) {
                request.setAttribute(RESPONSE_ANNOTATION, method.getAnnotation(ResponseResult.class));
            }
        }
        return true;
    }
}
