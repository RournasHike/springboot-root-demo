package com.mytest.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
@Service
public class AsyncService {
    //高速spring这是一个异步方法
    @Async //运行时开启线程池进行异步处理
    public void hello(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据处理中");
    }
}
