package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/25
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }
}
