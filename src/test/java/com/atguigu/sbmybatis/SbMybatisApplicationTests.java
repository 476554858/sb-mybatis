package com.atguigu.sbmybatis;

import com.atguigu.sbmybatis.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbMybatisApplicationTests {

	@Autowired
	EmployeeMapper employeeMapper;


	@Test
	public void contextLoads() {
	}

}
