package com.jdbc.connection;

import org.springframework.stereotype.Component;

@Component
public class EmployePojo {
	
	private int employeId;
	private String employeName;
	private int employeAge;
	private double employeSal;
	
//	toString()....
	
	@Override
	public String toString() {
		return "EmployePojo [employeId=" + employeId + ", employeName=" + employeName + ", employeAge=" + employeAge
				+ ", employeSal=" + employeSal + "]";
	}
	
//	Parameter Constructors and default Constructor...
	
	public EmployePojo() {
		
	}
	
	

	public EmployePojo(int employeId, String employeName, int employeAge, double employeSal) {
		super();
		this.employeId = employeId;
		this.employeName = employeName;
		this.employeAge = employeAge;
		this.employeSal = employeSal;
	}
	
	
//	Setters and Getters....
	
	public int getEmployeId() {
		return employeId;
	}
	
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public int getEmployeAge() {
		return employeAge;
	}
	public void setEmployeAge(int employeAge) {
		this.employeAge = employeAge;
	}
	public double getEmployeSal() {
		return employeSal;
	}
	public void setEmployeSal(double employeSal) {
		this.employeSal = employeSal;
	}
	
	

}
