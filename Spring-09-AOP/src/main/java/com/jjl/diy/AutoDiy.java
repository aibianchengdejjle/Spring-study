package com.jjl.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class AutoDiy {
    @Before("execution(* com.jjl.service.UserServiceImpl.*(..))")
    public  void before(){
        System.out.println("before");
    }
    @After("execution(* com.jjl.service.UserServiceImpl.*(..))")
    public  void after(){
        System.out.println("after");
    }
    @Around("execution(* com.jjl.service.UserServiceImpl.*(..))")
    public  void around(ProceedingJoinPoint jp) throws Throwable {

        Object proceed = jp.proceed();

    }
}
