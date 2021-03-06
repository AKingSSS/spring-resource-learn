package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" + "ename='" + ename + '\'' + ", gender='" + gender + '\'' + ", dept=" + dept + '}';
    }
}
