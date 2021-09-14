package com.mjj.ems.service.impl;

import com.mjj.ems.dao.EmpMapper;
import com.mjj.ems.model.Emp;
import com.mjj.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public int save(Emp emp) {
        return empMapper.insert(emp);
    }

    @Override
    public int del(Integer id) {
        return empMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Emp> queryEmpAll() {
        return empMapper.queryEmpAll();
    }

    @Override
    public int update(Emp emp) {
        return update(emp);
    }
}
