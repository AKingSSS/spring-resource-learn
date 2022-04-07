package com.aking.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/5
 * @Service(value = "scanService")  等于  <bean id="scanService" class="com.aking.learn.service.ScanService">
 * value 默认    ScanService --> scanService
 */
@Service
public class AutowireService {
    @Autowired
    @Qualifier(value = "orderServiceImpl")
    private OrderService orderService;

    @Value(value = "张三")
    private String name;

    public void buy() {
        System.out.println(name);
        orderService.buy();
    }
}
