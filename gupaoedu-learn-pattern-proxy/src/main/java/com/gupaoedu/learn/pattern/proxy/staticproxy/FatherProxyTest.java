package com.gupaoedu.learn.pattern.proxy.staticproxy;

/**
 * @Description: TODO
 * @ClassName: FatherProxyTest
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}