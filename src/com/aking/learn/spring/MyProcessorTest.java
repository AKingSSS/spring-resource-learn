package com.aking.learn.spring;

import com.aking.learn.pojo.processor.MyProcessor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/9
 */
public class MyProcessorTest {
    @Test
    public void testProcessor() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.aking.learn");
        final MyProcessor processor = context.getBean("myProcessor", MyProcessor.class);
        System.out.println("processor name = " + processor.getName());
    }
}
