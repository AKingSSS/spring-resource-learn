package com.aking.learn.pojo.autowire;

/**
 * @author yangkang
 * @date 2022/4/5
 */
public class Teacher {
    private String tName;

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" + "tName='" + tName + '\'' + '}';
    }
}
