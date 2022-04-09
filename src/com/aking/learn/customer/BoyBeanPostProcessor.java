package com.aking.learn.customer;

import com.aking.learn.annotation.Boy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author yangkang
 * @date 2022/4/9
 */
@Component
public class BoyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] declaredFields = bean.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Boy annotation = declaredField.getAnnotation(Boy.class);
            if (null == annotation) {
                continue;
            }
            declaredField.setAccessible(true);
            try {
                declaredField.set(bean, annotation.value());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return bean;
    }
}
