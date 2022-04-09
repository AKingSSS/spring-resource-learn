package com.aking.learn.pojo.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/9
 */
@Component
public class Wife implements BeanNameAware, EnvironmentAware {

    private String name;
    private String beanName;
    private Environment environment;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeanName() {
        return beanName;
    }


    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Environment getEnvironment() {
        return environment;
    }
}
