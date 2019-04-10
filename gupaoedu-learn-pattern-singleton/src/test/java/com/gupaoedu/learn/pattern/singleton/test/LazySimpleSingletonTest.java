package com.gupaoedu.learn.pattern.singleton.test;

/**
 * @Description: TODO
 * @ClassName: LazySimpleSingletonTest
 * @author: ren.xm
 * @date: 2019/4/3
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}