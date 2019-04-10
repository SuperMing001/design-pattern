package com.gupaoedu.learn.pattern.singleton.lazy;

/**
 * @Description: 懒汉式单例
 * @ClassName: LazySimpleSingleton
 * @author: ren.xm
 * @date: 2019/4/3
 * @Copyright: 2018 www.sandpay.com.cn Inc. All rights reserved.
 */
//在外部需要使用的时候才进行实例化
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}
    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;
    public static synchronized LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}