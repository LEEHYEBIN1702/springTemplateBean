package com.company.app.emp.service;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor // 인수가 없는 필드 생성자
@AllArgsConstructor // 모든 인수가 있는 필드 생성자

public class Emp {
    String employeeId;   
	String firstName;
	String lastName;
	String email;	
	Date hireDate;	
	String jobId;	
	String departmentId;
	Integer salary;
	String[] employeeIds;
}
