package com.atguigu.sbmybatis.mapper;

import com.atguigu.sbmybatis.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

    public List<Employee> getEmployees(@Param("ids")List<Integer> ids);

    public void batchInsert(@Param("emps")List<Employee> emps);

    public List<Employee> getAll();
}
