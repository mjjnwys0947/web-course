package com.mjj.adminserver.admin.controller;

import com.mjj.adminserver.admin.model.Admin;
import com.mjj.adminserver.admin.service.AdminService;
import com.mjj.adminserver.admin.vo.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class AdminController {


    @Autowired
    private AdminService adminService;


    @RequestMapping("/login")
    public @ResponseBody Object login(Admin admin){

        Admin findAdmin = adminService.findAdminByUsername(admin.getUsername());

        LoginResult result = new LoginResult();
        result.setSuccess(false);

        if (findAdmin == null){
            result.setMsg("账户不存在！");
        }else if (!findAdmin.getPassword().equals(admin.getPassword())){
            result.setMsg("密码错误");
        }else {
            result.setMsg("登陆成功！");
            result.setSuccess(true);
        }
        return result;
    }

}
