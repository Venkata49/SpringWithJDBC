package com.jdbc.connection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private Dao dao;

	@Autowired
	private DataSource data;
	
	public void save(EmployePojo emp)  {
		System.out.println("Service start...");
//		dao.save(emp);
		Connection con = null;
		PreparedStatement ps = null;
		try {
		 con = data.getConnection();
		 ps = con.prepareStatement("insert into EmployePojo values(?,?,?,?)");
		ps.setInt(1, emp.getEmployeId());
		ps.setString(2, emp.getEmployeName());
		ps.setInt(3, emp.getEmployeAge());
		ps.setDouble(4, emp.getEmployeSal());
		
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
		
		
		System.out.println("Service completed...");
	}
	
	
}
