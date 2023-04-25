package com.capstone.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capstone.project.exception.EmployeeIDException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(EmployeeIDException.class)
	  public ResponseEntity<String> handleEmployeeIDException(EmployeeIDException ex) {
	    return new ResponseEntity<String>("Invalid Employee ID", HttpStatus.BAD_REQUEST);
	  }

	  

}
