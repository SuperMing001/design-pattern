package com.gupaoedu.learn.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.learn.pattern.proxy.Person;

/**
 * @Description: TODO
 * @ClassName: Girl
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class Girl implements Person {

    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}