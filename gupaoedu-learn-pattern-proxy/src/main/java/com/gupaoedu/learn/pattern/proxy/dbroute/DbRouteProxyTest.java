package com.gupaoedu.learn.pattern.proxy.dbroute;

import com.gupaoedu.learn.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: DbRouteProxyTest
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

//            order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService)new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}