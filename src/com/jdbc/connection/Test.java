package com.jdbc.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OurConfiguration.class);
		
		Controller controll = applicationContext.getBean(Controller.class);
//		controll.save(new EmployePojo(1, "Devaratha", 23, 45000.33));
//		controll.save(new EmployePojo(2, "Adhira", 30, 55000.20));
//
//		controll.save(new EmployePojo(3, "Bhyrava", 25, 33000.00));
//		controll.save(new EmployePojo(4, "Keshava", 20, 15000.09));
//		controll.save(new EmployePojo(5, "Bhuvana", 27, 48000.12));
//		controll.save(new EmployePojo(6, "Ashok", 24, 25000.00));
	
//		controll.update(31000.01, 3);
		
		controll.delete(2);
	}

}
