package com.elvischang.springbootdemos.annotation;

import java.lang.annotation.*;

/**
 * @author elvischang
 * @create 2022-09-17-下午 02:48
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {
}
