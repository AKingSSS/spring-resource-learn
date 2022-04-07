package com.aking.learn.spring;

import com.aking.learn.pojo.*;
import com.aking.learn.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class TestSpring5 {

    /**
     * 测试文件系统的xml
     */
    @Test
    public void testFileSystemXml() {
        // 加载配置, 项目跟目录下
        ApplicationContext context = new FileSystemXmlApplicationContext("src/resource/userBean.xml");

        // 获取配置创建对象
        final User user = context.getBean("user", User.class);
        user.say();
    }

    /**
     * 测试类路径xml
     */
    @Test
    public void testClassPathXml() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/userBean.xml");

        // 获取配置创建对象
        final User user = context.getBean("user", User.class);
        user.say();
    }

    /**
     * set 注入
     */
    @Test
    public void testBook() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/bookBean.xml");

        // 获取配置创建对象
        final Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());
    }

    @Test
    public void testOrder() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/orderBean.xml");

        // 获取配置创建对象
        final Order order = context.getBean("order", Order.class);
        System.out.println(order.toString());
    }

    @Test
    public void testMovie() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/movieBean.xml");

        // 获取配置创建对象
        final Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie.toString());
    }

    /**
     * 测试用户服务
     * userService --> userDao
     */
    @Test
    public void testUserService() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/biz/userServiceBean.xml");

        // 获取配置创建对象
        final UserService userService = context.getBean("userService", UserService.class);
        userService.save();
    }

    /**
     * 1:n
     */
    @Test
    public void testEmp() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/empBean.xml");

        // 获取配置创建对象
        final Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }

    /**
     * list set map
     */
    @Test
    public void testStu() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/stuBean.xml");

        // 获取配置创建对象
        final Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu.toString());
    }

    /**
     * util 使用
     */
    @Test
    public void testStu2() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/stuBean2.xml");

        // 获取配置创建对象
        final Stu stu = context.getBean("stu2", Stu.class);
        System.out.println(stu.toString());
    }

    /**
     * factoryBean
     * 定义的类型跟返回类型可以不一样
     */
    @Test
    public void testFactoryBean() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/factoryBean.xml");

        // 获取配置创建对象
        final Book book = context.getBean("myBean", Book.class);
        System.out.println(book.toString());
    }

    /**
     * scope
     * 默认是单例
     * 测试scope
     */
    @Test
    public void testBookScopeBean() {
        // 加载配置, classpath 路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/pojo/bookBean2.xml");

        // 获取配置创建对象
        final Book book1 = context.getBean("book2", Book.class);
        final Book book2 = context.getBean("book2", Book.class);
        System.out.println(book1==book2);
    }
}
