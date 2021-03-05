package com.mytest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/9
 */
@RestController
public class ConfController {

    @RequestMapping("conf")
    public String index(){
        return "hello springboot config";
    }

}
