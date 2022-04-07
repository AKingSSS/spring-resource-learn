package com.aking.learn.spring;

import com.aking.learn.pojo.autowire.Student;
import com.aking.learn.service.OrderService;
import com.aking.learn.service.ScanService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/5
 */
public class ScanTest {

    @Test
    public void testScan() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/scan/scanBean.xml");
        // 获取配置创建对象
        final ScanService service = context.getBean("scanService", ScanService.class);
        System.out.println(service);
        service.say();
    }

    @Test
    public void testScanInclude() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/scan/scanIncludeBean.xml");
        // 获取配置创建对象
        final ScanService service = context.getBean("scanService", ScanService.class);
        System.out.println(service);
        service.say();
    }

    @Test
    public void testScanExclude() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/scan/scanExcludeBean.xml");
        // 获取配置创建对象
        final ScanService service = context.getBean("scanService", ScanService.class);
        System.out.println(service);
        service.say();
    }
}
