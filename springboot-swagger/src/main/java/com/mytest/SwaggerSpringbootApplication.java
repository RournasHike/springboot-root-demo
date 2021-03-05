package com.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
@SpringBootApplication
//@EnableSwagger2
public class SwaggerSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerSpringbootApplication.class,args);
    }
}