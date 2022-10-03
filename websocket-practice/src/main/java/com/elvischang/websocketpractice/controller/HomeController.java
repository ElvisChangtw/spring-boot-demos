package com.elvischang.websocketpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author elvischang
 * @create 2022-10-02-下午 11:33
 **/

@Controller
public class HomeController {


    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}
