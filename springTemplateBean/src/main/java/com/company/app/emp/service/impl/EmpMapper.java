package com.company.app.emp.service.impl;

import java.util.List;
import java.util.Map;

import com.company.app.emp.service.Emp;
import com.company.app.emp.service.Jobs;

// TDD : 테스트 주도 개발

// 구현 : 테스트(단위테스트(Junit), 통합테스트)
// 회원가입 - 이메일은 중복체크, 아이디 중복체트 후 입력(자바에서 서비스 메서드에서 다 체크 후 실행) 
// -> 정상흐름, 비정상흐름(이메일 중복된다면?)의 제이유닛을 테스트해야한다. (테스트단계)
// 회원탈퇴 - 게시판, 결제(3개월), 회원정보 삭제(서비스 로직이 간단하지 않고, 제일 중요함)

public interface EmpMapper {
	public Emp getEmp(Emp empVO);
	public List<Emp> getEmpList(Emp Emp);
	public void insertEmp(Emp empVO);
	public String getName(Integer id);
	public List<Map<String, Object>> getEmpMap();
	public List<Map<String, Object>> getDeptEmpCnt();
	public List<Jobs> jobSelect();
}

