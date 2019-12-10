package com.pk.study.spring.bean;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author pengkai
 * @date 2019/12/10
 */
public class OtherBean implements MethodReplacer {
    public OtherBean() {
    }

    public String getTestStr() {
        return "OtherBean.getTestStr()";
    }

    public String getName(){
        return "OtherBean.getName()";
    }

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        if(method.getName().contains("getTestStr")){
            return getTestStr();
        }
        return method.invoke(obj,args);
    }
}
