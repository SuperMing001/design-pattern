/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AbstractFactoryTest
 * Author:   ren.xm
 * Date:     2019/3/19 16:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.learn.pattern.factory.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ren.xm
 * @create 2019/3/19
 * @since 1.0.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();
    }
}