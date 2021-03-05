package com.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/25
 */
@SpringBootApplication
public class TomcatWarSpringbootApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TomcatWarSpringbootApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TomcatWarSpringbootApplication.class);
    }
}
