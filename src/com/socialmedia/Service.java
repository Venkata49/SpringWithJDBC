package com.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private Dao dao;
	
	public void save(YoutubePojo you) {
		System.out.println("Service Started..");
		dao.save(you);
		System.out.println("Service Completed..");		
	}
	public void savein(YoutubePojo poj) {
		System.out.println("Service Operation Started..");
		dao.savein(poj);
		System.out.println("Service Operation Completed..");
	}
	
//	Update...
	
	public void updateop (int youId, double youIncome,int youFollowers) {
		System.out.println("Service Operation Started..");
		dao.updateop( youId, youIncome, youFollowers);
		System.out.println("Service Operation Completed..");

	}
	
//	Delete...
	
	public void delete (int youId) {
		System.out.println("Service Operation Started..");
		dao.delete( youId);
		System.out.println("Service Operation Completed..");

	}
	
//	getById...
	
	public void getById (int youId) {
		System.out.println("Service Operation Started..");
		dao.getById( youId);
		System.out.println("Service Operation Completed..");

	}

//	getByIdEntairRow...
	
	public void getByIdEntairRow (int youId) {
		System.out.println("Service Operation Started..");
		dao.getByIdEntairRow( youId);
		System.out.println("Service Operation Completed..");

	}
	
//	getAll
	
	public void getAll () {
		System.out.println("Service Operation Started..");
		dao.getAll( );
		System.out.println("Service Operation Completed..");

	}


}
