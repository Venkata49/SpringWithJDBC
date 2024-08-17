package com.jdbc.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OurConfiguration.class);
		
		Controller controll = applicationContext.getBean(Controller.class);
		controll.save(new EmployePojo(1, "Devaratha", 23, 45000.33));
	}

}
