package com.mytest.controller;

import com.mytest.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
@Api("hello控制器")
@Controller
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    //只要我们的接口中返回值存在实体类就可以被swagger扫描到
    @PostMapping("user")
    @ResponseBody
    public User user(){
        return new User();
    }

    @ApiOperation("greet接口方法") //Operation接口，不是放在类上，而是在方法上
    @GetMapping("greet")
    @ResponseBody
    public String greet(@ApiParam("用户名") String username){
        return "hello"+username;
    }

    @ApiOperation("postm接口方法") //Operation接口，不是放在类上，而是在方法上
    @PostMapping("postm")
    @ResponseBody
    public User postm(@ApiParam("用户名") User user){
        return user;
    }
}
