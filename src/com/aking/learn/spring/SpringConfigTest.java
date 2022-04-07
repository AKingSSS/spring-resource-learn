package com.aking.learn.spring;

import com.aking.learn.config.SpringConfig;
import com.aking.learn.service.AutowireService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/5
 */
public class SpringConfigTest {
    @Test
    public void testConfig() {
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 获取配置创建对象
        final AutowireService service = context.getBean("autowireService", AutowireService.class);
        service.buy();
    }
}
