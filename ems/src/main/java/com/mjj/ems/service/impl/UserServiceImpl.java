package com.mjj.ems.service.impl;

import com.mjj.ems.dao.UserMapper;
import com.mjj.ems.model.User;
import com.mjj.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByUsername(String username) {
        return  userMapper.queryByUsername(username);
    }

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }
}
