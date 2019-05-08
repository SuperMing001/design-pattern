package com.gupaoedu.learn.pattern.strategy.pay.payport;


/**
 * 京东白条
 */
public class JDPay extends Payment {

    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
