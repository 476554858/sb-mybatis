package com.atguigu.sbmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.atguigu.sbmybatis.mapper")
@SpringBootApplication
public class SbMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMybatisApplication.class, args);
	}

}
