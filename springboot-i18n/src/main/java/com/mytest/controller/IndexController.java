package com.mytest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/26
 */
@Controller
public class IndexController {


    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
