/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PythonVideo
 * Author:   ren.xm
 * Date:     2019/3/19 16:19
 * Description: Python视频
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.learn.pattern.factory.abstractfactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Python视频〉
 *
 * @author ren.xm
 * @create 2019/3/19
 * @since 1.0.0
 */
public class PythonVideo implements IVideo {

    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}