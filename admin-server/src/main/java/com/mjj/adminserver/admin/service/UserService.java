package com.mjj.adminserver.admin.service;

import com.mjj.adminserver.admin.model.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUser();


    boolean save(User user);

    boolean delUser(Integer id);

    boolean update(User user);

    int getUserTotal();

    List<User> pageList(int pageTotal, int pageSize);
}
