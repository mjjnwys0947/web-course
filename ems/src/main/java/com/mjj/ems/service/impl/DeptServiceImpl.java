package com.mjj.ems.service.impl;

import com.mjj.ems.dao.DeptMapper;
import com.mjj.ems.model.Dept;
import com.mjj.ems.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptMapper deptMapper;

    @Override
    public int save(Dept dept) {
        return deptMapper.insert(dept);
    }

    @Override
    public int del(Integer id) {
        return deptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Dept> queryDeptAll() {
        return deptMapper.queryDeptAll();
    }

    @Override
    public int update(Dept dept) {
        return deptMapper.updateByPrimaryKey(dept);
    }
}
