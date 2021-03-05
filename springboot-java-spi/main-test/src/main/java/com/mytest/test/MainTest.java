package com.mytest.test;

import cn.mytest.service.PayService;

import java.util.ServiceLoader;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/15
 */
public class MainTest {
    public static void main(String[] args) {
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService : load) {//这里加载不出来，是因为spi是有规范的，需要对接上接口才可以服务器发现
//            System.out.println(payService);
            //MainTest在使用alipay服务实现时，没有任何实现类耦合，没有侵入性
            //动态加载了引入的相关依赖，就可以发现服务的实现，只要符合spi规范即可
            payService.pay();
        }
    }
}
