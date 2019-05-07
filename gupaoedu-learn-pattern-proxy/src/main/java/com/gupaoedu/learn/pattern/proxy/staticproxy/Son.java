package com.gupaoedu.learn.pattern.proxy.staticproxy;

import com.gupaoedu.learn.pattern.proxy.Person;

/**
 * @Description: TODO
 * @ClassName: Son
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class Son implements Person {

    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}