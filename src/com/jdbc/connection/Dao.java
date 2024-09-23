package com.jdbc.connection;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


//	Dao = Data Access Object this class used for Operations

	@Component
	public class Dao {
	
	@Autowired
	private DataSource data;
	
	@Autowired
	private JdbcTemplate jdb;	//	19/08/2023

	
	
//	With out using JdbcTemplate Normal way to create tables in jdbc using DataSource.....
	
/*	public void save(EmployePojo emp)  {
		System.out.println("Dao start...");

		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
		 con = data.getConnection();
		 ps = con.prepareStatement("insert into EmployePojo values(?,?,?,?)");
		 
		ps.setInt(1, emp.getEmployeId());
		ps.setString(2, emp.getEmployeName());
		ps.setInt(3, emp.getEmployeAge());
		ps.setDouble(4, emp.getEmployeSal());
		
		int row = ps.executeUpdate();
		
		System.out.println("Number of rows updates :"+row);
		ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
			ps.close();
			con.close();
			
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
		System.out.println("Dao Completed...");
	}
	
	*/
	
//	By using DataSource JdbcTemplate is Make easy to insert,update,delete operations in database....
	
	public void save(EmployePojo emp) {
		System.out.println("Dao Started....");
		
		String insertQuery = "insert into  spin.employepojo values (?,?,?,?)";
		
		jdb.update(insertQuery,emp.getEmployeId(),emp.getEmployeName(),emp.getEmployeAge(),emp.getEmployeSal());
				
		System.out.println("Dao Completeds....");
	}
	
//	Update operation...

	public void update (double employeSal , int employeId) {
		System.out.println("Dao Started....");
		
		String updateQuery = "update spin.employepojo set employeSal = ? where employeId = ?";
		
				int rowUpdate = jdb.update(updateQuery,employeSal,employeId);
				System.out.println("One row updates : "+ rowUpdate);
		System.out.println("Dao Completeds....");
	}
	
//	Deleted Operation...
	
	public void delete(int employeId) {
		System.out.println("Dao Started....");
		
		String deleteQuery = "delete from spin.employepojo where employeId = ?";
		
				int rowDelete =jdb.update(deleteQuery, employeId);
						
				System.out.println("One row effected : "+ rowDelete);
		System.out.println("Dao Completeds....");
	}
	

	
}
