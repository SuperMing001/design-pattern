package com.gupaoedu.learn.pattern.singleton.threadlocal;

/**
 * @Description: TODO
 * @ClassName: ThreadLocalSingleton
 * @author: ren.xm
 * @date: 2019/4/9
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}