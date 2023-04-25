package com.capstone.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeIDException;
import com.capstone.project.repo.EmployeRepo;
import com.capstone.project.vo.EmployeVO;
@Service
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	EmployeRepo repo;

	@Override
	public EmployeVO getEmployeeByEmployeeId(int employeeId) throws EmployeeIDException {
		Employee employee = repo.findById(employeeId).orElseThrow(
				() -> new EmployeeIDException("Invalid EmployeeId : " + employeeId));
		EmployeVO employeeVO = new EmployeVO(employee.getEmployeeId(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}
	
	
	

}
