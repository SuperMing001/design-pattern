package com.gupaoedu.learn.pattern.prototype.simple;

/**
 * @Description: TODO
 * @ClassName: Client
 * @author: ren.xm
 * @date: 2019/4/11
 * @Copyright: 2018 www.sandpay.com.cn Inc. All rights reserved.
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
        return (Prototype)concretePrototype.clone();
    }
}