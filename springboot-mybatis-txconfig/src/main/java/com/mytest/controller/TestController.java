package com.mytest.controller;

import com.mytest.mapper.UserMapper;
import com.mytest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/19
 */
@Controller
public class TestController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("selAll")
    @ResponseBody
    public List<User> selAll(){
        return userMapper.selAll();
    }

    @RequestMapping("insert")
    @ResponseBody
    public String insUser(User user){
        userMapper.insUser(user);
        return "ok";
    }

    @RequestMapping("selById")
    @ResponseBody
    public User selById(int uid){
        return userMapper.selUser(uid);
    }



}
