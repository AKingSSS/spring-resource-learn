package com.aking.learn.spring;

import com.aking.learn.pojo.Life;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class TestLifeSpringBean {
    @Test
    public void testLife() {
        // 加载配置, classpath 路径下
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/lifeBean.xml");
        // 获取配置创建对象
        final Life life = context.getBean("life", Life.class);
        System.out.println("第四步：获取创建实例bean对象");
        System.out.println(life.toString());
        context.close();
    }
}
