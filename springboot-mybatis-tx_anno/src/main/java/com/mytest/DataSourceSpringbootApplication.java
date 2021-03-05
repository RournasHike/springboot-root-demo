package com.mytest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/19
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mytest.mapper")
public class DataSourceSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataSourceSpringbootApplication.class,args);
    }
}
