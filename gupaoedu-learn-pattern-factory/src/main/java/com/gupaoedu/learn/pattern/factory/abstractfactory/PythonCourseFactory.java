/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PythonCourseFactory
 * Author:   ren.xm
 * Date:     2019/3/19 16:12
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
public class PythonCourseFactory implements CourseFactory {

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}