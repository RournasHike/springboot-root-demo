package com.mytest.controller;

import com.mytest.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@Controller
@EnableConfigurationProperties(AcmeProperties.class)
public class TestController {

    @Autowired
    private AcmeProperties properties;

    @RequestMapping("acme")
    @ResponseBody
    public AcmeProperties acme(){
        return properties;
    }
}
