package com.aking.learn.customer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/9
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    /**
     * 允许我们在工厂里所有的bean被加载进来后但是还没初始化前，对所有bean的属性进行修改也可以add属性值
     * BeanFactoryPostProcessor是在spring容器加载了bean的定义文件之后，在bean实例化之前执行的
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        final BeanDefinition myProcessor = beanFactory.getBeanDefinition("myProcessor");
        System.out.println("修改name属性");
        myProcessor.getPropertyValues().add("name", "myProcessor");
        System.out.println("MyBeanFactoryPostProcessor 执行完");
    }
}
