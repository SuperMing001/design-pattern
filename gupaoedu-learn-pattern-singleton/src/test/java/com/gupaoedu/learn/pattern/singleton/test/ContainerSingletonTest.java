package com.gupaoedu.learn.pattern.singleton.test;

import com.gupaoedu.learn.pattern.singleton.register.ContainerSingleton;

/**
 * @Description: TODO
 * @ClassName: ContainerSingletonTest
 * @author: ren.xm
 * @date: 2019/4/9
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {


        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");;
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + " ms.");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}