package com.jjl.service;

import com.jjl.dao.UserDao;

public class UserServiceImpl implements UserService{
    public UserDao userDao;
    //利用set方法来实现动态实现值得注入
   public  void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void getUser() {
        userDao.run();
    }
}
