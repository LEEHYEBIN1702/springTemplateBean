package com.company.app.emp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.emp.service.Emp;
import com.company.app.emp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	// bean 태그 대신에 어노테이션으로 설정
	// (DI : dependency Injection
	// 1. setter
	// 2. constructor
	// 3. field : @Autowired) ==> property(=set메소드), <constructor name="">
	
	@Autowired EmpMapper empMapper;
	
	// 생성자 방식(선호) or @AutoWired 방식
	@Autowired
	public EmpServiceImpl(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}
	
	@Override
	public void insertEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}

}
