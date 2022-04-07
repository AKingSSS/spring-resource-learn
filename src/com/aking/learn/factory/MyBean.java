package com.aking.learn.factory;

import com.aking.learn.pojo.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class MyBean implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        final Book book = new Book();
        book.setName("Java");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
