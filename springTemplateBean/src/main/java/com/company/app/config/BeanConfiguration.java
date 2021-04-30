package com.company.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.impl.EmpMapper;
import com.company.app.emp.service.impl.EmpServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.company") // 자동으로 @Service(=EmpServiceImpl.class)를 이용해 스캔해서 등록 가능(자바기반), @Bean 대신에 스캔
public class BeanConfiguration {
	
	//@Bean // @Service 대신, 
	//xml <bean id="" class=""><cons...> 와 동일하다.
	/*
	 * public EmpService empService(EmpMapper empMapper) { return new
	 * EmpServiceImpl(empMapper); // 생성자에 Mapper를 넣어준다. }
	 */
}
