package com.mjj.adminserver.admin.service;

import com.mjj.adminserver.admin.model.Admin;

public interface AdminService {

    Admin findAdminByUsername(String username);

}
