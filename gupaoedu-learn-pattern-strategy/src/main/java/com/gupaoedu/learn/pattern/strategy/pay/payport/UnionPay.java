package com.gupaoedu.learn.pattern.strategy.pay.payport;

/**
 * 银联支付
 */
public class UnionPay extends Payment {

    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }

}
