package com.company.app;

import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.company.app.config.BeanConfiguration;
import com.company.app.config.DBConfiguration;
import com.company.app.config.MybatisConfiguration;
import com.company.app.emp.service.Emp;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.impl.EmpMapper;

@Transactional // test가 끝날 때마다 롤백해라
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfiguration.class,
								 MybatisConfiguration.class, 
								 BeanConfiguration.class}) // config 패키지의 configuration Class 파일을 읽어온다.
public class EmpMapperClient {
	@Autowired EmpMapper empMapper;
	@Autowired EmpService empService;
	
	@Test
	@Rollback
	public void insert( ) {
		Emp emp = Emp.builder()
					.employeeId("2001")
					.firstName("lee")
					.lastName("dahyun")
					.email("z@z.zac")
					.hireDate(new Date(System.currentTimeMillis()))
					.jobId("IT_PROG")
					.build();
		// 객체 생성하고 값을 초기화 하는 역할
		// lombok에서 제공한다.
		
		empService.insertEmp(emp); // 등록
		emp = empMapper.getEmp(emp); // 단건조회
		// 조회된 값이 null이 아닌 경우 출력
		assertNotNull(emp);
	}
	
	// test 후 rollback 가능
}
