package com.jdbc.connection;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


//	OurConfiguration class used for only connection

@Configuration
@ComponentScan("com.jdbc.connection")
public class OurConfiguration {
	
	@Bean
    public DataSource dataSource() {
		
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spin");
        dataSource.setUsername("root");
        dataSource.setPassword("tiger");
               
        
        return dataSource;
    }
	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbc = new JdbcTemplate(dataSource());
		
		return jdbc;
	}

}
