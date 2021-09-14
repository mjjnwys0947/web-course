package com.mjj.ems.controller;

import com.mjj.ems.model.Emp;
import com.mjj.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/emp")
@Controller
@CrossOrigin
public class EmpController {


    @Autowired
    private EmpService EmpService;

    @RequestMapping(value = "/save")
    public String saveEmp(Emp emp){
        EmpService.save(emp);
        return "";
    }


    @RequestMapping("/del")
    public String del(Integer id){
        EmpService.del(id);
        return "";
    }


    @RequestMapping("/showAll")
    public @ResponseBody
    Object showAll(){
        return EmpService.queryEmpAll();
    }

    @RequestMapping("/update")
    public String update(Emp emp){
        EmpService.update(emp);
        return "";
    }
}
