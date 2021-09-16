package com.mjj.adminserver.admin.service.impl;

import com.mjj.adminserver.admin.mapper.AdminMapper;
import com.mjj.adminserver.admin.model.Admin;
import com.mjj.adminserver.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin findAdminByUsername(String username) {
        return adminMapper.queryByUsername(username);
    }
}
