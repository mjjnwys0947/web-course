package com.mjj.ems.service;

import com.mjj.ems.model.Emp;

import java.util.List;

public interface EmpService {
    int save(Emp emp);

    int del(Integer id);

    List<Emp> queryEmpAll();

    int update(Emp emp);


}
