package com.aking.learn.aspect;

import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/5
 */
@Service
public class Person {

    public void say() {
        System.out.println("hello world");
    }
}
