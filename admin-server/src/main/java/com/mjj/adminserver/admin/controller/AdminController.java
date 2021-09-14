package com.mjj.adminserver.admin.controller;

import com.mjj.adminserver.admin.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {




    @RequestMapping("/login")
    public @ResponseBody Object login(Admin admin){


        return null;
    }

}
