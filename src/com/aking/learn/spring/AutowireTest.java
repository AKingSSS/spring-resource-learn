package com.aking.learn.spring;

import com.aking.learn.pojo.Life;
import com.aking.learn.pojo.autowire.Student;
import com.aking.learn.service.AutowireService;
import com.aking.learn.service.OrderService;
import com.aking.learn.service.ResourceService;
import com.aking.learn.service.ScanService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/5
 */
public class AutowireTest {

    @Test
    public void testAutowire() {
        // 加载配置, classpath 路径下
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/scan/scanBean.xml");
        // 获取配置创建对象
        final AutowireService service = context.getBean("autowireService", AutowireService.class);
        service.buy();
    }


    @Test
    public void testResource() {
        // 加载配置, classpath 路径下
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/scan/scanBean.xml");
        // 获取配置创建对象
        final ResourceService service = context.getBean("resourceService", ResourceService.class);
        service.buy();
    }


}
