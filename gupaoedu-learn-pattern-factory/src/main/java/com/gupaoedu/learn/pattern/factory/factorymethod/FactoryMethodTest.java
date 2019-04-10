/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FactoryMethodTest
 * Author:   ren.xm
 * Date:     2019/3/19 15:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.learn.pattern.factory.factorymethod;

import com.gupaoedu.learn.pattern.factory.ICourse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ren.xm
 * @create 2019/3/19
 * @since 1.0.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();

    }
}