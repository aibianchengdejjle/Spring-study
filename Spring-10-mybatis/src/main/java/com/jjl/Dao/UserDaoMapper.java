package com.jjl.Dao;

import com.jjl.pojo.User;

public interface UserDaoMapper {
    User getUserById(int id);
    int adduser(User user);
    int delete(int id);
}
