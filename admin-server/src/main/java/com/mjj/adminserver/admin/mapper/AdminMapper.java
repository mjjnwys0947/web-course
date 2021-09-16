package com.mjj.adminserver.admin.mapper;

import com.mjj.adminserver.admin.model.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    Admin queryByUsername(String username);
    
}
