package com.aking.learn.spring;

import com.aking.learn.pojo.processor.HelloBoy;
import com.aking.learn.pojo.processor.MyProcessor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/9
 */
public class BeanPostProcessorTest {
    @Test
    public void testProcessor() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.aking.learn");
        final HelloBoy boy = context.getBean("helloBoy", HelloBoy.class);
        boy.say();
    }
}
