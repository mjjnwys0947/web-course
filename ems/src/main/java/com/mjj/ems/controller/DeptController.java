package com.mjj.ems.controller;

import com.mjj.ems.model.Dept;
import com.mjj.ems.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
     private  DeptService deptService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveDept(Dept dept){
        deptService.save(dept);
        return "";
    }


    @RequestMapping("/del")
    public String del(Integer id){
        deptService.del(id);
        return "";
    }


    @RequestMapping("/showAll")
    public @ResponseBody Object showAll(){
        return deptService.queryDeptAll();
    }

    @RequestMapping("/update")
    public String update(Dept dept){
        deptService.update(dept);
        return "";
    }

}
