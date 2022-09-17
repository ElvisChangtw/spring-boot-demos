package com.elvischang.springbootdemos.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author elvischang
 * @create 2022-09-17-下午 02:29
 **/

@AllArgsConstructor
@Data
public class Response<T> implements Serializable {

    private T data;


    private Integer code;


    private String message;

}
