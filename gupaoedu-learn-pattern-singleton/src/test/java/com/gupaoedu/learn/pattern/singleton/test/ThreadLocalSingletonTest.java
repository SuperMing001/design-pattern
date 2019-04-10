package com.gupaoedu.learn.pattern.singleton.test;

import com.gupaoedu.learn.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @Description: TODO
 * @ClassName: ThreadLocalSingletonTest
 * @author: ren.xm
 * @date: 2019/4/9
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}