package com.aking.learn.pojo.processor;

import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/9
 */
@Component
public class MyProcessor {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
