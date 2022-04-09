package com.aking.learn.spring;

import com.aking.learn.pojo.init.Apple;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/9
 */
public class InitTest {
    @Test
    public void testInit() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.aking.learn");
        // 获取配置创建对象
        final Apple apple = context.getBean("apple", Apple.class);
        context.close();
    }
}
