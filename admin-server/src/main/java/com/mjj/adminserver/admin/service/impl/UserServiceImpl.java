package com.mjj.adminserver.admin.service.impl;

import com.mjj.adminserver.admin.mapper.UserMapper;
import com.mjj.adminserver.admin.model.User;
import com.mjj.adminserver.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAll();
    }

    @Override
    public boolean save(User user) {
        return userMapper.save(user) == 1;
    }

    @Override
    public boolean delUser(Integer id) {
        return userMapper.delUserById(id) == 1;
    }

    @Override
    public boolean update(User user) {
        return userMapper.update(user) == 1 ;
    }

    @Override
    public int getUserTotal() {
        return userMapper.getUserTotal();
    }

    @Override
    public List<User> pageList(int pageTotal, int pageSize) {
        int skip = (pageTotal -1) * pageSize;
        return userMapper.pageList(skip,pageSize);
    }
}
