package com.gupaoedu.learn.pattern.proxy.dbroute.proxy;

import com.gupaoedu.learn.pattern.proxy.dynamicproxy.gpproxy.GPInvocationHandler;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

/**
 * @Description: TODO
 * @ClassName: OrderServiceDynamicProxy
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class OrderServiceDynamicProxy implements GPInvocationHandler {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    Object proxyObj;
    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}