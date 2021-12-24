package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Passenger_Table;
import com.example.demo.layer3.PassengerIMPL;

@SpringBootTest
public class PassengerTest {
	
	@Autowired
	PassengerIMPL pasgRepo;
	
	@Test
	void insertPassengerTable() {
		
//		LocalDate ld=LocalDate.of(1998, 10, 1);
		Passenger_Table pasgObj=new Passenger_Table();
		pasgObj.setFirstName("Ajinkya");
		pasgObj.setLastname("Ombase");
		pasgObj.setGender("Male");
		pasgObj.setDateofBirth(LocalDate.of(1998, 5, 1));
		pasgRepo.insertpassengerRecord(pasgObj);
	}
	
	
	@Test
	void updatePassengerTable() {
		
		Passenger_Table pasgObj=null;
		pasgObj=pasgRepo.find(Passenger_Table.class, 10);
		pasgObj.setFirstName("Lokesh");
		pasgObj.setLastname("Patil");
		pasgObj.setGender("Male");
		pasgObj.setDateofBirth(LocalDate.of(1998, 5, 1));
		pasgRepo.updatePassenger(pasgObj);
	
	}
	
	@Test
	void deletePassengerTable() {
		Passenger_Table pasgObj=new Passenger_Table();
		pasgRepo.remove(Passenger_Table.class, 11);
	}
	

	@Test
	 void fetchById() {
		Passenger_Table pasgObj;
		pasgObj=pasgRepo.selectPassenger(12);
	  System.out.println("Passenger_Table FIRST_NAME"+pasgObj.getFirstName());
	  System.out.println("Passenger_Table LAST_NAME: "+pasgObj.getLastname());
	  System.out.println("Passenger_Table GENDER :"+pasgObj.getGender());
	  System.out.println("Passenger_Table DATE_OF_BIRTH: "+pasgObj.getDateofBirth());
	 
	  System.out.println("-----------------------------------------");
	 }
	
	 @Test
	 void fetchAllAddress() {
	  List<Passenger_Table> pasgList;
	  pasgList=pasgRepo.selectAllPassenger();
	  for(Passenger_Table
			  pasgObj: pasgList)
	  {

		  System.out.println("Passenger_Table PASSENGER_ID :"+pasgObj.getPassengerid());
		  System.out.println("Passenger_Table FIRST_NAME :"+pasgObj.getFirstName());
		  System.out.println("Passenger_Table LAST_NAME"+pasgObj.getLastname());
		  System.out.println("Passenger_Table GENDER: "+pasgObj.getGender());
		  System.out.println("Passenger_Table DATE_OF_BIRTH: "+pasgObj.getDateofBirth());
		  
		  
		  System.out.println("-----------------------------------------");
	  }
	
	
	
	
	 }
}

