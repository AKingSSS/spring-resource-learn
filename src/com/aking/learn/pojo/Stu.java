package com.aking.learn.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class Stu {
    /**
     * 数组
     */
    private String[] courses;

    /**
     * list
     */
    private List<String> hobby;

    /**
     * 家庭
     */
    private List<Family> families;

    /**
     * map
     */
    private Map<String,String> map;

    /**
     * set
     */
    private Set<String> labels;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setLabels(Set<String> labels) {
        this.labels = labels;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Stu{" + "courses=" + Arrays.toString(courses) + ", hobby=" + hobby + ", families=" + families + ", map="
            + map + ", labels=" + labels + '}';
    }
}
