package com.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/25
 */
@EnableAsync //开启异步注解功能
@EnableScheduling //开启基于注解的定时任务
@SpringBootApplication
public class ScheduleTaskSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleTaskSpringbootApplication.class, args);
    }

}