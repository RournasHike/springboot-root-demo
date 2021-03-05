package com.mytest.controller;

import com.mytest.model.AcmeProperties;
import com.mytest.model.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@Controller
public class TestController {

    @Autowired
    private AcmeProperties properties;

    @Bean
    public Dep getDep(){
        return new Dep();
    }

    @Autowired
    private Dep dep;

    @RequestMapping("dep")
    @ResponseBody
    public Dep tryDep(){
        System.out.println(dep);
        return dep;
    }

    @RequestMapping("acme")
    @ResponseBody
    public AcmeProperties acme(){
        return properties;
    }
}
