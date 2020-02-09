package com.pk.study.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author pengkai
 * @date 2019-12-18
 */
@Aspect
public class MyAspect {
    @Pointcut("execution(* *.test(..))")
    public void test() {
    }

    @Before("test()")
    public void before() {
        System.out.println("before()");
    }

    @Before("test()")
    public void after() {
        System.out.println("after()");
    }

    @Around("test()")
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("around start");
        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around end");
        return result;
    }
}
