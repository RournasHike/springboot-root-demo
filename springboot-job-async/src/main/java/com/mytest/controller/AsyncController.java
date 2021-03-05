package com.mytest.controller;

import com.mytest.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
@Controller
public class AsyncController {
    @Autowired
    AsyncService asyncService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        asyncService.hello();
        return "ok";
    }
}
