package com.aking.learn.proxy;

import com.aking.learn.dao.UserDao;
import com.aking.learn.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangkang
 * @date 2022/4/5
 */
public class JdkProxy implements InvocationHandler {

    private UserDao userDao;

    public JdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(String.format("方法%s前执行", method.getName()));
        final Object res = method.invoke(userDao, args);
        System.out.println(String.format("方法%s后执行", method.getName()));
        return res;
    }

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        final UserDao dao = (UserDao)Proxy
            .newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new JdkProxy(userDao));
        dao.save();
    }
}
