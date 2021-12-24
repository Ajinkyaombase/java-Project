package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Bus_Table;
import com.example.demo.layer2.Passenger_Table;
import com.example.demo.layer2.Passenger_Ticket_Book;
import com.example.demo.layer2.User_Table;
import com.example.demo.layer3.BusTableIMPL;
import com.example.demo.layer3.PassengerTikBookIMPL;

@SpringBootTest
public class OneToManyBusToTik {
	
	@Autowired
	BusTableIMPL bustt;
	
	@Autowired
	PassengerTikBookIMPL passtik;
	
	
	@Test
	void oneBusToManyTik() {
	
		Bus_Table passObj2 = bustt.selectBusTable(7);
		
		Passenger_Ticket_Book passTik2 = new Passenger_Ticket_Book();
		
		passTik2.setBust(passObj2);
		
		passtik.insertPassengerTikBookRecord(passTik2);
		
	}

}
