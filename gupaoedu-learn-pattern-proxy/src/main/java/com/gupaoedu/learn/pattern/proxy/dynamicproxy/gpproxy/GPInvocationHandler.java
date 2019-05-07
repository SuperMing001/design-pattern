package com.gupaoedu.learn.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @ClassName: GPInvocationHandler
 * @author: ren.xm
 * @date: 2019/5/7
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
