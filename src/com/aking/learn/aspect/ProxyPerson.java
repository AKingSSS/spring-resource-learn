package com.aking.learn.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/5
 * 环绕之前操作
 * 方法处理前操作
 * hello world
 * 环绕之后操作
 * 方法处理后操作
 * afterReturning操作
 */
@Service
@Aspect
public class ProxyPerson {

    @Pointcut(value = "execution(* com.aking.learn.aspect.*.*(..))")
    public void point() {

    }

    /**
     * 前置处理
     */
    @Before(value = "point()")
    public void before() {
        System.out.println("方法处理前操作");
    }

    /**
     * 后置处理（不管有没有异常）
     */
    @After(value = "point()")
    public void after() {
        System.out.println("方法处理后操作");
    }

    /**
     * 有异常不处理
     * 有返回结果处理
     */
    @AfterReturning(value = "point()")
    public void afterReturning() {
        System.out.println("afterReturning操作");
    }

    /**
     * 后置处理
     */
    @AfterThrowing(value = "point()")
    public void afterThrowing() {
        System.out.println("afterThrowing操作");
    }

    /**
     * 环绕处理
     */
    @Around(value = "point()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕之前操作");
        point.proceed();
        System.out.println("环绕之后操作");
    }
}
