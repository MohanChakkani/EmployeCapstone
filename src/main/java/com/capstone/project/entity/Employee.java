package com.capstone.project.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Employee")
public class Employee {
	
	
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "EmployeeID")
    private int employeeId;
    
    //@Column(name = "EmployeeName")
    private String employeeName;
    
    //@Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;
    
	
	


}
