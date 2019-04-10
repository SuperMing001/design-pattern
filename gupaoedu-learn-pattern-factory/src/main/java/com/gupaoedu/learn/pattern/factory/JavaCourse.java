/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaCourse
 * Author:   ren.xm
 * Date:     2019/3/19 14:08
 * Description: Java课程
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.learn.pattern.factory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Java课程〉
 *
 * @author ren.xm
 * @create 2019/3/19
 * @since 1.0.0
 */
public class JavaCourse implements ICourse{

    public void record() {
        System.out.println("录制Java课程");
    }
}