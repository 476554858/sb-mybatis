package com.atguigu.sbmybatis.controller;

import com.atguigu.sbmybatis.bean.Department;
import com.atguigu.sbmybatis.bean.Employee;
import com.atguigu.sbmybatis.mapper.DepartmentMapper;
import com.atguigu.sbmybatis.mapper.EmployeeMapper;
import com.atguigu.sbmybatis.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
         deptService.getDepat(id);
        return null;
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDepartment(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        employeeMapper.getEmpById(id);
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/emptest")
    public PageInfo emptest(){
        /*List<Employee> emps = 	employeeMapper.getEmployees(Arrays.asList(1, 2));
        for(Employee item:emps){
            System.out.println("++++++++++++"+item);
        }*/
        /*List<Employee> emps = new ArrayList<Employee>();
        for(int i=1;i<10;i++){
            emps.add(new Employee(null,"员工"+i,0,i+"@qq.com",1));
        }
        employeeMapper.batchInsert(emps);*/
        PageHelper.startPage(1,5);
        List<Employee> emps = employeeMapper.getAll();
        PageInfo pageInfo = new PageInfo(emps,5);
        return pageInfo;
    }
}
