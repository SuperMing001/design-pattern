package com.gupaoedu.learn.pattern.delegate.simple;

/**
 * @Description: TODO
 * @ClassName: Boss
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}