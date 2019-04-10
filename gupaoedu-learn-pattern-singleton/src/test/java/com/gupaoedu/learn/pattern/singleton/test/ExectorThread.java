package com.gupaoedu.learn.pattern.singleton.test;

import com.gupaoedu.learn.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @Description: TODO
 * @ClassName: ExectorThread
 * @author: ren.xm
 * @date: 2019/4/3
 * @Copyright: 2018 www.sandpay.com.cn Inc. All rights reserved.
 */
public class ExectorThread implements Runnable {

    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}