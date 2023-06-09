package com.capstone.project.vo;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EmployeVO {
	private int employeeId;    
    private String employeeName;
    private String dateOfBirth;
    
    private static final String ALGORITHM = "AES";
	private static final String KEY = "employeeencrp345";
	
	public EmployeVO(int employeeId, String employeeName, LocalDate localDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = encrypt(localDate.toString(), KEY);
	}
	private static String encrypt(String text, String key) {
		try {
			SecretKeySpec aesKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), ALGORITHM);
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			byte[] encrypted = cipher.doFinal(text.getBytes(StandardCharsets.UTF_8));
			return Base64.getEncoder().encodeToString(encrypted);
		} catch (Exception e) {
			throw new RuntimeException("Error encrypting text", e);
		}
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = encrypt(dateOfBirth.toString(), KEY);
	}
	
	
	
	

}
