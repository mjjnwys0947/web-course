package com.mjj.ems.dao;

import com.mjj.ems.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User queryByUsername(String username);

    int save(User user);
}
