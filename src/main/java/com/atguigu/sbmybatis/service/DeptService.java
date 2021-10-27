package com.atguigu.sbmybatis.service;

import com.atguigu.sbmybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Transactional
    public void getDepat(Integer id){
        departmentMapper.getDepartmnetById(id);
        departmentMapper.getDepartmnetById(id);
        departmentMapper.getDepartmnetById(id);
        departmentMapper.getDepartmnetById(id);
    }
}
