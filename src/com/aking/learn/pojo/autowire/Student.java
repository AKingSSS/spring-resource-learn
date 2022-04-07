package com.aking.learn.pojo.autowire;

/**
 * @author yangkang
 * @date 2022/4/5
 */
public class Student {
    private String stuName;

    private Teacher teacher1;

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher1 = teacher;
    }

    @Override
    public String toString() {
        return "Student{" + "stuName='" + stuName + '\'' + ", teacher=" + teacher1 + '}';
    }
}
