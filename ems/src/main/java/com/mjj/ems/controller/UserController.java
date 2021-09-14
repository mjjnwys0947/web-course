package com.mjj.ems.controller;

import com.mjj.ems.model.User;
import com.mjj.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public @ResponseBody Object login(User user){

        User user1 = userService.queryByUsername(user.getUsername());
        if (user1 == null){
            return 2;
        }else  if(user.getPassword().equals(user1.getPassword())){
            return 1;
        }else {
            return 3;
        }


    }


    @RequestMapping("/save")
    public void save(User user){
        userService.save(user);
    }



}
