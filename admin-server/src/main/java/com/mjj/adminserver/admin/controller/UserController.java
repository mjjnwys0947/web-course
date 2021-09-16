package com.mjj.adminserver.admin.controller;

import com.mjj.adminserver.admin.model.User;
import com.mjj.adminserver.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/queryAllUser")
    public Object queryUserAll(){

        List<User> users = userService.queryAllUser();
        return  users;
    }

    @PostMapping("/saveUser")
    public Object  saveUser(User user){

        boolean success = userService.save(user);
        return success;
    }

    @DeleteMapping("/delUser/{id}")
    public Object delUser(@PathVariable("id") Integer id){
        boolean success = userService.delUser(id);
        return id;
    }

    @PostMapping("/updateUser")
    public Object update(User user){
        boolean success = userService.update(user);
        return success;
    }

    @RequestMapping("/getUserTotal")
    public Object getUserTotal(){
        return userService.getUserTotal()== 1;
    }

    @RequestMapping("/pageList/{pageTotal}/{pageSize}")
    public Object pageList(@PathVariable("pageTotal") int pageTotal,
                           @RequestParam(value = "pageSize", defaultValue = "1")@PathVariable("pageSize") int pageSize){

        return userService.pageList(pageTotal,pageSize);

    }

}
