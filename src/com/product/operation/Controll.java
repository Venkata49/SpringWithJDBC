package com.product.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controll {
	
//	Service class Inject into Controll throw @Autowired
	
	@Autowired
	private Service service;
	
//	NamedParameterJdbcTemplate Operations Started Here....

	public void savenpjt(productPojo pro) {
		System.out.println("Controll Operation Started..");
		service.save(pro);
		System.out.println("Controll Operation Completed..");
	}
	
	public void save(productPojo pro) {
		System.out.println("Controll Operation Started..");
		service.save(pro);
		System.out.println("Controll Operation Completed..");
	}
	
	
//	update operation....
	
	public void updatenpjt(int productInt, double productPrice) {
		System.out.println("Controll Operation Started..");
		service.update(productInt, productPrice);
		System.out.println("Controll Operation Completed..");

	}
	

//	update operation....
	
	public void update(int productInt, double productPrice) {
		System.out.println("Controll Operation Started..");
		service.update(productInt, productPrice);
		System.out.println("Controll Operation Completed..");

	}
	
	//Delete Operation...
	
		public void delete(int productId) {
			System.out.println("Controll Operation Started..");
			service.delete(productId);				
			System.out.println("Controll Operation Completed..");

		}

	
//	getById()....
	
	public  void getById(int productId) {
		System.out.println("Controll Operation Started..");
		service.getById(productId);
		System.out.println("Controll Operation Completed..");
	}
	
//	getByName()....
	
	public  void getByName(String productName) {
		System.out.println("Controll Operation Started...");
		
		service.getByName(productName);
		System.out.println("Controll Operation Completed...");
	}

	
//	getByIdRow()....
	
	public void getByIdRow(int productId) {
		System.out.println("Controll Operation Started...");
		service.getByIdRow(productId);
		System.out.println("Controll Operation Completed...");
		
	}
	
//	getAll()....
	
	public  void getAll() {
		System.out.println("Controll Operation Started...");
		service.getAll();		
		
		System.out.println("Controll Operation Completed...");
	}
	
//	Count()....
	
	public  void count() {
		System.out.println("Controll Operation Started...");
		service.count();
		System.out.println("Controll Operation Completed...");
	}
	
//	Max()....
	
	public  void max() {
		System.out.println("Controll Operation Started...");
		service.max();
		System.out.println("Controll Operation Completed...");
	}
	
//	Average()....
	
	public  void avg() {
		System.out.println("Controll Operation Started...");
		service.avg();
		System.out.println("Controll Operation Completed...");
	}

	
//	Sum()....
	
	public  void sum() {
		System.out.println("Controll Operation Started...");
		service.sum();
		System.out.println("Controll Operation Completed...");
	}


//	GetAll() Operation using List<Map<String, Object>>....
	
	public void selectQuery() {
		System.out.println("Controll Started....");
		service.selectQuery();
		System.out.println("Controll Completeds....");
	}

//	Insert data into database using batchupdates....
	
	public void batchUpdates(productPojo produ) {
		
		System.out.println("Controll Started....");
		service.batchUpdates(produ);
		System.out.println("Controll Completed....");
		
		
	}
	
	public void saveBatchUpdate(String fileName) {
		System.out.println("Controll Started....");
		service.saveBatchUpdate(fileName);
		System.out.println("Controll Completed....");

	}

}
