package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/16
 */
@Controller
public class IndexController {

    @RequestMapping("/test")
    public String index(){
        return "test";
    }
}
