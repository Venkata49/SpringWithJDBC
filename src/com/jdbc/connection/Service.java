package com.jdbc.connection;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private Dao dao;

	public void save(EmployePojo emp) {
		System.out.println("Service start...");
		dao.save(emp);
		System.out.println("Service Completed...");
		
	}
	
//	Update Operation...
	
	public void update(double employeSal, int employeId) {
		System.out.println("Service Started....");
		
		dao.update(employeSal, employeId);
				
		System.out.println("Service Completeds....");
	}
	
//	Delete Operation...
	
	public void delete(int employeId) {
		System.out.println("Service Started....");
		
		dao.delete( employeId);
				
		System.out.println("Service Completeds....");
	}
}
