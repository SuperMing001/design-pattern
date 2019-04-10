/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PythonNote
 * Author:   ren.xm
 * Date:     2019/3/19 16:08
 * Description: Python笔记
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.learn.pattern.factory.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Python笔记〉
 *
 * @author ren.xm
 * @create 2019/3/19
 * @since 1.0.0
 */
public class PythonNote implements INote {

    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}