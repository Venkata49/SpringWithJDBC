package com.socialmedia;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ap = new AnnotationConfigApplicationContext(OurConfiguration.class);
		Controller con = ap.getBean(Controller.class);
		Scanner sc = new Scanner(System.in);
		YoutubePojo yt = new YoutubePojo();
		
		System.out.println("Please enter  the operation : ");
		
		String click = sc.next();
		switch(click) {
		
		case "save":
			
			System.out.println("Please enter the data to save ");
			System.out.println("----------------------------------");
			
			System.out.println("Please enter the YouId : ");
			yt.setYouId(sc.nextInt());
			System.out.println("Please enter the YouName : ");
			yt.setYouName(sc.next());
			
			System.out.println("Please enter the YouChanalName : ");
			yt.setYouChanalName(sc.next());
			System.out.println("Please enter the YouIncome : ");
			yt.setYouIncome(sc.nextDouble());
			System.out.println("Please enter the youfollowers : ");
			yt.setYoufollowers(sc.nextInt());
			
			
			System.out.println("---------------------------------------");
			con.savein(yt);
			
			break;
		case "update":
			
			System.out.println("Please enter the data to update :");
			System.out.println("---------------------------------------");
			System.out.println("Please enter the YouId to update : ");
			yt.setYouId(sc.nextInt());
			System.out.println("Please enter the youIncome to update : ");
			yt.setYouIncome(sc.nextDouble());
			System.out.println("Please enter the youFollowers to update : ");
			yt.setYoufollowers(sc.nextInt());
			
			con.updateop(yt.getYouId(), yt.getYouIncome(), yt.getYoufollowers());
						
			break;
		
		case "delete":
			
			System.out.println("Please enter the data to Delete :");
			System.out.println("---------------------------------------");
			System.out.println("Please enter the YouId to Delete : ");
			yt.setYouId(sc.nextInt());
			con.delete(yt.getYouId());
			break;
		case "getById":
			
			System.out.println("Please enter the data to getById :");
			System.out.println("---------------------------------------");
			System.out.println("Please enter the YouId to getById : ");
			yt.setYouId(sc.nextInt());
			 con.getById(yt.getYouId());
			 
			break;
		case "getByIdRow":
			
			System.out.println("Please enter the data to getByIdRow :");
			System.out.println("---------------------------------------");
			System.out.println("Please enter the YouId to getByIdRow : ");
			yt.setYouId(sc.nextInt());
			
			 con.getByIdEntairRow(yt.getYouId());
			 
			break;
		case "getAll":
			con.getAll();
			
			break;
		
		}
	}

}
