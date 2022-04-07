package com.aking.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangkang
 * @date 2022/4/5
 *  Configuration 作为配置类，代替xml文件
 *
 */
@Configuration
@ComponentScan(basePackages = "com.aking.learn")
public class SpringConfig {
}
