package com.mjj.adminserver.admin.mapper;

import com.mjj.adminserver.admin.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {


    List<User> queryAll();

    int save(User user);

    int delUserById(Integer id);

    int update(User user);

    int getUserTotal();

    List<User> pageList(@Param("skip") int skip, @Param("pageSize") int pageSize);
}
