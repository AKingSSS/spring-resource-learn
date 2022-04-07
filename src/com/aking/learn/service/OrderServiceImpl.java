package com.aking.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/5
 * @Service(value = "scanService")  等于  <bean id="scanService" class="com.aking.learn.service.ScanService">
 * value 默认    ScanService --> scanService
 */
@Service(value = "orderServiceImpl")
public class OrderServiceImpl implements OrderService {
    @Override
    public void buy() {
        System.out.println("buy gift success");
    }
}
