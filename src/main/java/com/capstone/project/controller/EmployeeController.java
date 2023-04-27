package com.capstone.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.project.exception.EmployeeIDException;
import com.capstone.project.service.IEmployeeService;
import com.capstone.project.vo.EmployeVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/{employeeID}")
    public EmployeVO getEmployeeById(@PathVariable int employeeID) throws EmployeeIDException {
		log.info("EmployeeId("+employeeID+") is called");
		return service.getEmployeeByEmployeeId(employeeID);
		
        
    }
}
