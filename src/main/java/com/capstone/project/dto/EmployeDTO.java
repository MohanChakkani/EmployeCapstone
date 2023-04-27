package com.capstone.project.dto;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeDTO {
	
    private int employeeID;
    
   
    private String employeeName;
    
    
    private Date dateOfBirth;
}
