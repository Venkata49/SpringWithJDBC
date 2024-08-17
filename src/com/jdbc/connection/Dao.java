package com.jdbc.connection;


import org.springframework.stereotype.Component;

@Component
public class Dao {
	

	public void save(EmployePojo emp) {
		System.out.println("Dao start...");
//		System.out.println(emp);
		
		
		System.out.println("Dao Completed...");
	}
	
	
}
