package com.aking.learn.service;

import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/5
 * @Service(value = "scanService")  等于  <bean id="scanService" class="com.aking.learn.service.ScanService">
 * value 默认    ScanService --> scanService
 */
@Service(value = "orderServiceImpl2")
public class OrderServiceImpl2 implements OrderService {
    @Override
    public void buy() {
        System.out.println("buy fruit success");
    }
}
