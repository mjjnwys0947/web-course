package com.mjj.ems.service;

import com.mjj.ems.model.Dept;

import java.util.List;

public interface DeptService {

    int save(Dept dept);

    int del(Integer id);

    List<Dept> queryDeptAll();

    int update(Dept dept);

}
