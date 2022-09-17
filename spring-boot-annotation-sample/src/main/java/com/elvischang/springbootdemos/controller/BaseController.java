package com.elvischang.springbootdemos.controller;

/**
 * @author elvischang
 * @create 2022-09-17-下午 02:39
 **/

import com.elvischang.springbootdemos.annotation.ResponseResult;
import com.elvischang.springbootdemos.enums.ResponseCode;
import com.elvischang.springbootdemos.model.pojo.User;
import com.elvischang.springbootdemos.model.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class BaseController {

    @GetMapping("/user/findAll")
    public Response<List<User>> findAllUser() {

        List<User> findAllUser = createUsers();
        // encapsulate response
        Response response = new Response(findAllUser, ResponseCode.SUCCESS.code(), ResponseCode.SUCCESS.message());

        return response;
    }


    @ResponseResult
    @GetMapping("/user/findAllByAnnotation")
    public List<User> findAllUserByAnnotation() {

        List<User> allUsers = createUsers();
        return allUsers;
    }

    private List<User> createUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("Ko Wen-je", 63));
        list.add(new User("Tsai Ing-wen", 66));
        return list;
    }


}
