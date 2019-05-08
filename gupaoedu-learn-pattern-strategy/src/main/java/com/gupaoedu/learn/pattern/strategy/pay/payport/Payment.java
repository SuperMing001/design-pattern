package com.gupaoedu.learn.pattern.strategy.pay.payport;

import com.gupaoedu.learn.pattern.strategy.pay.MsgResult;

/**
 * @Description: 支付渠道
 * @ClassName: Payment
 * @author: ren.xm
 * @date: 2019/5/8
 */
public abstract class Payment {
    //支付类型
    public abstract String getName();

    //查询余额
    protected abstract double queryBalance(String uid);

    //扣款支付
    public MsgResult pay(String uid, double amount) {
        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额：" + amount);
    }
}