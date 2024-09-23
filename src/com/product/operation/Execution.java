package com.product.operation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Execution {
	public static void main(String[] args) {
		
		ApplicationContext application = new AnnotationConfigApplicationContext(OurConfiguration.class);
		
		Controll c = application.getBean(Controll.class);
		
//		NamedParameterJdbcTemplate Operations Started Here....
//		c.savenpjt(new productPojo(11, "Oppo", 7200.00, 6.6, "Oppo153"));
//		c.savenpjt(new productPojo(12, "LG", 8000.00, 7.0, "Lg050"));
		
		c.updatenpjt(12, 8110);
		
		
		
		
//		.......................................................................................................
		
		
		
		
		
		
//		c.save(new productPojo(1, "Nokia", 5500.00, 10.2, "Nok123"));
//		c.save(new productPojo(2, "Vivo", 6500.00, 10.2, "Vivo342"));
//		c.save(new productPojo(3, "OnePlus", 8500.00, 10.2, "One009"));
//		c.save(new productPojo(4, "Apple", 10000.00, 10.2, "Apple211"));
		
		
//		c.update(1,  5770.00);
//c.getById(1);
//		c.getByName("Apple");
//		c.getAll();
//		c.getByIdRow(2);
		
//		c.count();
//		c.max();
//		c.avg();
//		c.sum();
//		c.selectQuery();
//		c.batchUpdates(null);
		

		
	/*	
		Scanner sc = new Scanner(System.in);

		productPojo pp = new productPojo();
		
		System.out.println("Please enter  the operation : ");
		
		String click = sc.next();
		switch(click) {
		
		case "save":
			
			System.out.println("Please enter the data to save ");
			System.out.println("----------------------------------");
			System.out.println("Please enter the productId : ");
			pp.setProductId(sc.nextInt());
			System.out.println("Please enter the productName : ");
			pp.setProductName(sc.next());
			System.out.println("Please enter the productPrice : ");
			pp.setProductPrice(sc.nextDouble());
			System.out.println("Please enter the productGst : ");
			pp.setProductGst(sc.nextDouble());
			System.out.println("Please enter the productModel : ");
			pp.setProductModel(sc.next());
			
			System.out.println("---------------------------------------");

			c.save(pp);
			break;
		case "update":
			
			System.out.println("Please enter the data to update :");
			System.out.println("---------------------------------------");
			
			System.out.println("Please enter the productId to update : ");
			pp.setProductId(sc.nextInt());
//			System.out.println("Please enter the productName : ");
//			pp.setProductName(sc.next());
			System.out.println("Please enter the productPrice to update : ");
			pp.setProductPrice(sc.nextDouble());
			
			c.update(pp.getProductId(), pp.getProductPrice());
			
			System.out.println("---------------------------------------");
			
			break;
		
		case "delete":
			
			System.out.println("Please enter the pid to delete : ");
			System.out.println("---------------------------------------");
			System.out.println("Please enter the productId to delete : ");
			pp.setProductId(sc.nextInt());
			c.delete(pp.getProductId());
			
			System.out.println("---------------------------------------------");
			break;
			
		case "getById":
			
			System.out.println("Please enter the data to search by product : ");
			System.out.println("---------------------------------------");
			System.out.println("Please enter the productId to search : ");
			pp.setProductId(sc.nextInt());
			c.getById(pp.getProductId());
			
			System.out.println("---------------------------------------------");
			break;
		case "getAll":
			
			System.out.println("Please enter the data to getAll : ");
			System.out.println("-------------------------------------");
			c.getAll();
			break;
			
		case "bulkupload":
			System.out.println("Please enter the data to search by filename :");
			System.out.println("Please the enter the filename : ");
			String fileName = sc.next();
			c.saveBatchUpdate(fileName);
			System.out.println("----------------------------------------------");
			
			
			break;
			
		default:
		
		}
	
	
*/
		
	}
}