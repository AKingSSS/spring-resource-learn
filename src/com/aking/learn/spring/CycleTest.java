package com.aking.learn.spring;

import com.aking.learn.pojo.cycle.Computer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/7
 */
public class CycleTest {
    @Test
    public void testAutowire() {
        // 加载配置, classpath 路径下
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("resource/pojo/cycle/cycleBean.xml");
        // 获取配置创建对象
        final Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }
}
