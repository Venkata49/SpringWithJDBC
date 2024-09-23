package com.product.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
//	Service class Inject into Controll throw @Autowired

	@Autowired
	private Dao dao;
	
//	NamedParameterJdbcTemplate Operations Started Here....

	public void savenpjt(productPojo pro) {
		System.out.println("Service Operation Started..");
		dao.savenpjt(pro);
		System.out.println("Service Operation Completed..");
	}
	
	
	public void save(productPojo pro) {
		System.out.println("Service Operation Started..");
		dao.save(pro);
		System.out.println("Service Operation Completed..");
	}

//	update operation....
	
	public void updatenpjt(int productInt, double productPrice) {
		System.out.println("Service Operation Started..");
		dao.update(productInt, productPrice);
		System.out.println("Service Operation Completed..");

	}
//	update operation....
	
	public void update(int productInt, double productPrice) {
		System.out.println("Service Operation Started..");
		dao.update(productInt, productPrice);
		System.out.println("Service Operation Completed..");

	}
	
//Delete Operation...
	
	public void delete(int productId) {
		System.out.println("Service Operation Started..");
		dao.delete(productId);				
		System.out.println("Service Operation Completed..");

	}

	
//	getById()....
	
	public  void getById(int productId) {
		System.out.println("Service Operation Started..");
		dao.getById(productId);
		System.out.println("Service Operation Completed..");
	}
	
//	getByName()....
	
	public  void getByName(String productName) {
		System.out.println("Service Operation Started...");
		dao.getByName(productName);
		System.out.println("Service Operation Completed...");
	}
	
//	getByIdRow()....
	
	public void getByIdRow(int productId) {
		System.out.println("Service Operation Started...");
		dao.getByIdRow(productId);
		System.out.println("Service Operation Completed...");
		
	}
	
//	getAll()....
	
	public  void getAll() {
		System.out.println("Service Operation Started...");
		dao.getAll();		
		
		System.out.println("Service Operation Completed...");
	}
	
//	Count()....
	
	public  void count() {
		System.out.println("Service Operation Started...");
		dao.count();
		System.out.println("Service Operation Completed...");
	}
	
//	max()....
	
	public  void max() {
		System.out.println("Service Operation Started...");
		dao.max();
		System.out.println("Service Operation Completed...");
	}
	
//	Average()....
	
	public  void avg() {
		System.out.println("Service Operation Started...");
		dao.avg();
		System.out.println("Service Operation Completed...");
	}
	
//	Sum()....
	
	public  void sum() {
		System.out.println("Service Operation Started...");
		dao.sum();
		System.out.println("Service Operation Completed...");
	}

//	GetAll() Operation using List<Map<String, Object>>....
	
	public void selectQuery() {
		System.out.println("Service Started....");
		dao.selectQuery();
		System.out.println("Service Completeds....");
	}
	
//	Insert data into database using batchupdates....
	
	public void batchUpdates(productPojo produ) {
		
		System.out.println("Service Started....");
		dao.batchUpdates(produ);
		System.out.println("Service Completeds....");

				
	}
	
	public void saveBatchUpdate(String fileName) {
		System.out.println("Service Started....");

		dao.saveBatchUpdate(fileName);
		System.out.println("Service Completeds....");

	}
}





