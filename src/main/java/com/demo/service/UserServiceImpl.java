package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.model.User;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "userService")
@ManagedBean
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
