package com.aking.learn.service;

import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/5
 * @Service(value = "scanService")  等于  <bean id="scanService" class="com.aking.learn.service.ScanService">
 * value 默认    ScanService --> scanService
 */
@Service(value = "scanService")
public class ScanService {
    private String name;

    public void say() {
        System.out.println("hello");
    }
}
