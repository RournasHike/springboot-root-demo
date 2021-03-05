package com.mytest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
@Configuration
@EnableSwagger2 //开启swagger2
public class SwaggerConfig {
    //如swagger什么都没配置，有默认值

//    @Bean
//    public Docket docket1(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("AA");
//    }
//
//    @Bean
//    public Docket docket2(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("group");
//    }

    //配置了springboot swagger2的bean实例
    @Bean
    public Docket docket3(Environment environment){
        //获取项目环境
        Profiles profiles=Profiles.of("dev","test");
        //通过environment.acceptsProfiles()判断当前环境是否在自己设定的环境中
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否启用swagger,如false则swagger不能在浏览器中访问
                .enable(flag)
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                // basePackage指定要扫描的包
                // any:扫描全部
                // none:什么都不扫描
                // withClassAnnotation:扫描类上的注解
                // withMethodAnnotation:扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.mytest.controller"))
                //过滤的路径
                //.paths(PathSelectors.ant("kuang/**"))
                .build();
    }

    //配置swagger信息apiinfo
    private ApiInfo apiInfo(){
        Contact contact = new Contact("Alex", "http://www.baidu.com", "2057473561@qq.com");
        return new ApiInfo("狂神swagger api doc", "kuangshen", "1.0", "http://www.baidu.com", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }
}
