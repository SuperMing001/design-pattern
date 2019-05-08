package com.gupaoedu.learn.pattern.strategy.pay.payport;

/**
 * 微信支付
 */
public class WechatPay extends Payment {

    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }

}
