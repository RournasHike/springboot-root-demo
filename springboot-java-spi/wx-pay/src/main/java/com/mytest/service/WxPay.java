package com.mytest.service;

import cn.mytest.service.PayService;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/15
 */
public class WxPay implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
