package com.aking.learn.spring;

import com.aking.learn.aspect.Person;
import com.aking.learn.service.AutowireService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/5
 */
public class AopTest {
    @Test
    public void testAutowire() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/aop/aopBean.xml");
        // 获取配置创建对象
        final Person person = context.getBean("person", Person.class);
        person.say();
    }
}
