package com.capstone.project.service;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeIDException;
import com.capstone.project.vo.EmployeVO;

public interface IEmployeeService {
	public EmployeVO getEmployeeByEmployeeId(int employeeId) throws EmployeeIDException;
}