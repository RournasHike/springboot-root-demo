package com.mytest.controller;

import com.mytest.model.Dog;
import com.mytest.model.Peo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/17
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @Autowired
    private Peo peo;

    @RequestMapping(value = "/peo",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Peo getUser(){
        System.out.println(peo);
        return peo;
    }

    @Autowired
    private Dog dog;

    @RequestMapping("dog")
    @ResponseBody
    public Dog getDog(){
        System.out.println(dog);
        return dog;
    }

    @RequestMapping("aa")
    @ResponseBody
    public Dog dog(){
        Dog dog2=new Dog();
        dog2.setName("哈士奇");
        dog2.setAge(15);
        dog2.setSex("雄性");
        return dog2;
    }
}
