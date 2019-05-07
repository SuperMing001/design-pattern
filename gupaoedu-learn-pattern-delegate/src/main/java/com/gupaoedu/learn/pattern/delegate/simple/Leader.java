package com.gupaoedu.learn.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @ClassName: Leader
 * @author: ren.xm
 * @date: 2019/5/7
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader() {
        targets.put("加密",new EmployeeA());
        targets.put("登录",new EmployeeB());
    }

    //项目经理自己不干活
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}