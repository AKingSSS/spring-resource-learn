package com.aking.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangkang
 * @date 2022/4/5
 * @Service(value = "scanService")  等于  <bean id="scanService" class="com.aking.learn.service.ScanService">
 * value 默认    ScanService --> scanService
 */
@Service
public class ResourceService {
    @Resource(name = "orderServiceImpl2")
    private OrderService orderService;

    public void buy() {
        orderService.buy();
    }
}
