package com.gupaoedu.learn.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @Description: TODO
 * @ClassName: JinGuBang
 * @author: ren.xm
 * @date: 2019/4/11
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}