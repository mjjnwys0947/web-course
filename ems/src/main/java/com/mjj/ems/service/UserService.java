package com.mjj.ems.service;

import com.mjj.ems.model.User;

public interface UserService {

    User queryByUsername(String username);

    int save(User user);
}
