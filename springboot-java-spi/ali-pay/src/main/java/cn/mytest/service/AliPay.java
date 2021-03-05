package cn.mytest.service;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/15
 */
public class AliPay implements PayService{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
