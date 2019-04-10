/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CurseFactory
 * Author:   ren.xm
 * Date:     2019/3/13 15:19
 * Description: 简单工厂方法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoedu.learn.pattern.factory.simplefactory;

import com.gupaoedu.learn.pattern.factory.ICourse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简单工厂方法〉
 *
 * @author ren.xm
 * @create 2019/3/13
 * @since 1.0.0
 */
public class CurseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if(null != clazz){
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}