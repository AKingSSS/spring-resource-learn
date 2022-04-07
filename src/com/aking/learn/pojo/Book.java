package com.aking.learn.pojo;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class Book {
    /**
     * 名字
     */
    private String name;
    /**
     * 价格
     */
    private Integer price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
