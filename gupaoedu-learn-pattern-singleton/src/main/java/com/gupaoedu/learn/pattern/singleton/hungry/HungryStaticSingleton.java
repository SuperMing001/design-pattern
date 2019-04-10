package com.gupaoedu.learn.pattern.singleton.hungry;

/**
 * @Description: 饿汉式静态块单例
 * @ClassName: HungryStaticSingleton
 * @author: ren.xm
 * @date: 2019/4/3
 * @Copyright: 2018 www.sandpay.com.cn Inc. All rights reserved.
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}