package com.devnote.service.impl;

import com.devnote.dao.UserMapper;
import com.devnote.entity.UserDO;
import com.devnote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-03-12 18:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(UserDO user){
        return userMapper.insert(user);
    }

}
