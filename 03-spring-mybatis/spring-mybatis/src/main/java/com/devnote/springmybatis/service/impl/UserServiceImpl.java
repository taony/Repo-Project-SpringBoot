package com.devnote.springmybatis.service.impl;

import com.devnote.springmybatis.dao.UserDao;
import com.devnote.springmybatis.entity.User;
import com.devnote.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-03-12 23:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insert(User user) {
        userDao.insert(user);
        return 0;
    }
}
