package com.gupaoedu.learn.pattern.proxy.dbroute;

/**
 * @Description: TODO
 * @ClassName: OrderDao
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}