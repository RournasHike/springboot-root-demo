package com.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
@SpringBootApplication
@EnableAsync //开启异步注解功能
public class AsyncSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsyncSpringbootApplication.class,args);
    }
}
