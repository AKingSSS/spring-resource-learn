package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" + "dname='" + dname + '\'' + '}';
    }
}
