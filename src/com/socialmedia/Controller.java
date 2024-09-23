package com.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private Service serv;
	
	public void save(YoutubePojo you) {
		System.out.println("Controller Started..");
		serv.save(you);
		System.out.println("Controller Completed..");
	}
	public void savein(YoutubePojo poj) {
		System.out.println("Controller Operation Started..");
		serv.savein(poj);
		System.out.println("Controller Operation Completed..");
	}

//	Update...
	
	public void updateop (int youId, double youIncome,int youFollowers) {
		System.out.println("Controller Operation Started..");
		serv.updateop(youId, youIncome, youFollowers);
		System.out.println("Controller Operation Completed..");

	}
	
//	Delete...
	
	public void delete (int youId) {
		System.out.println("Controller Operation Started..");
		serv.delete(youId);
		System.out.println("Controller Operation Completed..");

	}
	
//	getById...
	
	public void getById (int youId) {
		System.out.println("Controller Operation Started..");
		serv.getById(youId);
		System.out.println("Controller Operation Completed..");

	}
	
//	getByIdEntairRow...
	
	public void getByIdEntairRow (int youId) {
		System.out.println("Controller Operation Started..");
		serv.getByIdEntairRow(youId);
		System.out.println("Controller Operation Completed..");

	}
//	getAll...
	
	public void getAll () {
		System.out.println("Controller Operation Started..");
		serv.getAll();
		System.out.println("Controller Operation Completed..");

	}

}
