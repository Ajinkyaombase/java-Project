package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Passenger_Table;
import com.example.demo.layer2.User_Table;
import com.example.demo.layer3.PassengerIMPL;
import com.example.demo.layer3.UserTableIMPL;

@SpringBootTest
public class OneToManyPassaenger_User {
	@Autowired
	UserTableIMPL user;
	
	@Autowired
	PassengerIMPL pass;
	
	@Test
	void oneUserToManyPassenger() {
		LocalDate ld=LocalDate.of(1998, 9, 8);
		//Passenger_Table passe=pass.selectPassenger(10);
		User_Table userr=user.selectUserTable(31);
		
		
		Passenger_Table passe=new Passenger_Table();
		//userr.setUserid(101);
		passe.setFirstName("Ajinkya");
		passe.setLastname("Ombase");
		passe.setDateofBirth(ld);
		passe.setGender("Male");
		passe.setUsert(userr);
		pass.insertpassengerRecord(passe);
		
		Passenger_Table passe2=new Passenger_Table();
		//userr.setUserid(101);
		passe2.setFirstName("Swapnil");
		passe2.setLastname("Dipke");
		passe2.setDateofBirth(ld);
		passe2.setGender("Male");
		passe2.setUsert(userr);
		pass.insertpassengerRecord(passe2);
		
	}

}
