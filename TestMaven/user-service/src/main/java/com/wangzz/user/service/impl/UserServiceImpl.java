package com.wangzz.user.service.impl;

import com.wangzz.user.dao.UserDao;
import com.wangzz.user.entity.User;
import com.wangzz.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户Service实现类
 * @author Administrator
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User login(User user) {
        return userDao.login(user);
    }

}
