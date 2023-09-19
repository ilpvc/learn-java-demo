package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.MPMultiTenant.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.example.demo.MPMultiTenant")
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Demo1Application.class, args);

	}

}
