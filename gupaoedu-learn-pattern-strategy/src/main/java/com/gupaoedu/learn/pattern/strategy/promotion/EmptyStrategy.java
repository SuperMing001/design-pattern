package com.gupaoedu.learn.pattern.strategy.promotion;
/**
 * 无优惠
 */
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
