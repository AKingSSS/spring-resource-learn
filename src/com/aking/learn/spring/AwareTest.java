package com.aking.learn.spring;

import com.aking.learn.pojo.aware.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/9
 */
public class AwareTest {
    @Test
    public void testProcessor() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.aking.learn");
        final Wife wife = context.getBean(Wife.class);
        System.out.println(wife.getBeanName());
        System.out.println(wife.getEnvironment());
    }
}
