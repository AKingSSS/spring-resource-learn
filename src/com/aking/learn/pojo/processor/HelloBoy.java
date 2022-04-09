package com.aking.learn.pojo.processor;

import com.aking.learn.annotation.Boy;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/9
 */
@Component
public class HelloBoy {
    @Boy(value = "小明")
    private String name;

    public void say() {
        System.out.println("hello, " + name);
    }
}
