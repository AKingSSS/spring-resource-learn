package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class Movie {
    private String name;
    private Integer rank;

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Movie{" + "name='" + name + '\'' + ", rank=" + rank + '}';
    }
}
