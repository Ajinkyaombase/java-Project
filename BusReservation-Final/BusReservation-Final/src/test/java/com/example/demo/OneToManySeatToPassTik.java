package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Passenger_Ticket_Book;
import com.example.demo.layer2.Seat_Table;
import com.example.demo.layer3.PassengerTikBookIMPL;
import com.example.demo.layer3.SeatTableIMPL;

@SpringBootTest
public class OneToManySeatToPassTik {

	
	@Autowired
	PassengerTikBookIMPL passt;
	
	@Autowired
	SeatTableIMPL set;
	
	
	@Test
	void onetoManySeatToTik() {
	
	    Seat_Table seatObj= set.selectSeatTable(21);
		Passenger_Ticket_Book passObj= new Passenger_Ticket_Book();
		passObj.setSeat(seatObj);
		
		passt.insertPassengerTikBookRecord(passObj);
		
	}
	
}
