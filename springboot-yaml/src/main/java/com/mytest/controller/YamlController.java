package com.mytest.controller;

import com.mytest.model.*;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@Controller
public class YamlController {
    @Autowired
    private YamlModel model;

    @Autowired
    private Dog dog;

    @Autowired
    private User user;

    @Autowired
    private Person person;

    @Autowired
    private APerson aPerson;

    @Autowired
    private AUser aUser;

    @RequestMapping("yamlModel")
    @ResponseBody
    public YamlModel yaml(){
        System.out.println(model);
        return model;
    }

    @RequestMapping("user")
    @ResponseBody
    public User getUser(){
        System.out.println(user);
        return user;
    }

    @RequestMapping("dog")
    @ResponseBody
    public Dog getDog(){
        System.out.println(dog);
        return dog;
    }

    @RequestMapping("person")
    @ResponseBody
    public Person getPerson(){
        System.out.println(person);
        return person;
    }

    @RequestMapping("aperson")
    @ResponseBody
    public APerson getAPerson(){
        System.out.println(aPerson);
        return aPerson;
    }

    @RequestMapping(value = "auser",method = RequestMethod.GET)
    @ResponseBody
    public AUser getaUser() throws UnsupportedEncodingException {
        System.out.println(aUser);
        return aUser;
    }

}