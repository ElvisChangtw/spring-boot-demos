package com.elvischang.springbootdemos.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author elvischang
 * @create 2022-09-17-下午 02:27
 **/
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS(222, "request succeeded!"),

    ERROR(444, "request failed!");

    private Integer code;

    private String message;

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}
