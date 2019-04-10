/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SimpleFactoryTest
 * Author:   ren.xm
 * Date:     2019/3/13 16:14
 * Description: 简单工厂模型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.learn.pattern.factory.simplefactory;

import com.gupaoedu.learn.pattern.factory.ICourse;
import com.gupaoedu.learn.pattern.factory.PythonCourse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简单工厂模型〉
 *
 * @author ren.xm
 * @create 2019/3/13
 * @since 1.0.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CurseFactory factory =new CurseFactory();
        ICourse course = factory.create(PythonCourse.class);
        course.record();
    }
}