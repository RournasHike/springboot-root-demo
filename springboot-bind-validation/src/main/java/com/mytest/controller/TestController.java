package com.mytest.controller;

import com.mytest.model.AcmeProperties;
import com.mytest.model.OwnerProperties;
import com.mytest.model.Profile;
import com.mytest.model.ThirdComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/10
 */
@Controller
//@EnableConfigurationProperties(AcmeProperties.class)
public class TestController {

    @Autowired
    private AcmeProperties properties;

    @Autowired
    private ThirdComponent thirdComponent;

    @RequestMapping("third")
    @ResponseBody
    public ThirdComponent thirdComponent(){
        System.out.println(thirdComponent);
        return thirdComponent;
    }

    @Autowired
    private OwnerProperties ownerProperties;

    @RequestMapping("owner")
    @ResponseBody
    public OwnerProperties ownerProperties(){
        System.out.println(ownerProperties);
        return ownerProperties;
    }

    @RequestMapping("/file/upload")
    public void upload(@RequestPart("files") MultipartFile files, @Validated Profile profile, Errors error) throws IOException {
        if(error.hasErrors()){
            return;
        }
        files.transferTo(new File(files.getOriginalFilename()));//保存文件
    }


    @RequestMapping("acme")
    @ResponseBody
    public AcmeProperties acme(){
        return properties;
    }
}
