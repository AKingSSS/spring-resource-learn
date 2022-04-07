package com.aking.learn.service;

import com.aking.learn.dao.UserDao;

/**
 * @author yangkang
 * @date 2022/4/4
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
