package com.product.operation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.product.operation")
public class OurConfiguration {

	@Bean
	public DataSource datasource() {
		
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driver.setUrl("jdbc:mysql://localhost:3306/product");
		driver.setUsername("root");
		driver.setPassword("tiger");
		
		return driver;
	}
	
//	JDBC Template... This templete having all jdbc internall connections....

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbc = new JdbcTemplate(datasource());
		
		return jdbc;
	}
	
	@Bean
	public NamedParameterJdbcTemplate  npjtp() {
		
		return new NamedParameterJdbcTemplate(datasource());
	}

}
