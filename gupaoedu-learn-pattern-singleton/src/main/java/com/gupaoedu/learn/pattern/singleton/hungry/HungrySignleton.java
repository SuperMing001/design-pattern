package com.gupaoedu.learn.pattern.singleton.hungry;

/**
 * @Description: 饿汉式单例
 * @ClassName: HungrySignleton
 * @author: ren.xm
 * @date: 2019/4/3
 */
//它是在类加载的时候就立即初始化，并且创建单例对象
//优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式好
//缺点：类加载的时候就初始化，不管你用还是不用，我都占着空间，浪费了内存
//绝对线程安全，在线程还没出现以前就实例化了，不可能存在访问安全问题
public class HungrySignleton {
    //类的执行顺序
    //先静态后动态
    //先属性后方法
    //先上后下
    private static final HungrySignleton hungrySignleton = new HungrySignleton();

    private  HungrySignleton(){}

    public static HungrySignleton getInstance(){
        return hungrySignleton;
    }
}