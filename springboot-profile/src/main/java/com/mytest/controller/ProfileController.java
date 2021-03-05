package com.mytest.controller;

import com.mytest.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/9
 */
@RestController
public class ProfileController {

    @Autowired
    private AcmeProperties acmeProperties;


    @RequestMapping("profile")
    public AcmeProperties index(){
        System.out.println(acmeProperties);
        return acmeProperties;
    }

}
