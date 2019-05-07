package com.gupaoedu.learn.pattern.proxy.staticproxy;

import com.gupaoedu.learn.pattern.proxy.Person;

/**
 * @Description: TODO
 * @ClassName: Father
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class Father implements Person {
    private Son person;

    public Father(Son person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");
    }
}