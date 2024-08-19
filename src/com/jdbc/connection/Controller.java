package com.jdbc.connection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private Service serv;
	
	public void save(EmployePojo emp) {
		System.out.println("Controller start...");
		serv.save(emp);
		System.out.println("Controller Completed...");
		
	}

	
//	Update operation...
	
	public void update(double employeSal, int employeId) {
		System.out.println("Controller Started....");
		
		serv.update(employeSal, employeId);				
		System.out.println("Controller Completeds....");
	}
	
//	Delete Operation...
	
	public void delete(int employeId) {
		System.out.println("Controller Started....");
		
		serv.delete(employeId);
				
		System.out.println("Controller Completeds....");
	}
}
