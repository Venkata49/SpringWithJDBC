package com.jdbc.connection;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private Dao dao;
	
	public void save(EmployePojo emp) {
		System.out.println("Service start...");
		dao.save(emp);
		System.out.println("Service completed...");
	}
	
	@Bean
    public DataSource dataSource() {
		
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spin");
        dataSource.setUsername("root");
        dataSource.setPassword("tiger");
        
        
        
        
        return dataSource;
    }
}
