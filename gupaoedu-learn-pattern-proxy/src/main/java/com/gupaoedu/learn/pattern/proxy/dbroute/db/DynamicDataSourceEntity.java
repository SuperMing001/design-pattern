package com.gupaoedu.learn.pattern.proxy.dbroute.db;

/**
 * @Description: 动态切换数据源
 * @ClassName: DynamicDataSourceEntity
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class DynamicDataSourceEntity {

    //默认数据源
    public final static String DEFAULE_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntity(){}

    /**
     * 清空数据源
     */
    public static void clear(){
        local.remove();
    }

    /**
     * 获取当前正在使用的数据源名字
     * @return
     */
    public static String get(){
        return  local.get();
    }

    /**
     * 还原当前切面的数据源
     */
    public static void restore(){
        local.set(DEFAULE_SOURCE);
    }

    /**
     * 设置已知名字的数据源
     * @param source
     */
    public static void set(String source){
        local.set(source);
    }

    /**
     * 根据年份动态设置数据源
     * @param year
     */
    public static void set(int year){
        local.set("DB_" + year);
    }
}