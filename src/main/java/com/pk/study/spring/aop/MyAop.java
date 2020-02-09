package com.pk.study.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author pengkai
 * @date 2020/2/5
 */
@Component
@EnableAspectJAutoProxy
@Aspect
public class MyAop {

    @Pointcut("execution(* *.test(..))")
    public void test(){

    }

    @Around("test()")
    public Object around(ProceedingJoinPoint pjp){
        System.out.println("around before");
        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after");
        return result;
    }

}
