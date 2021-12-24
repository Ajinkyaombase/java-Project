package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Bus_Table;
import com.example.demo.layer2.Passenger_Table;
import com.example.demo.layer2.Passenger_Ticket_Book;
import com.example.demo.layer2.Seat_Table;
import com.example.demo.layer2.User_Table;
import com.example.demo.layer3.BusTableIMPL;
import com.example.demo.layer3.PassengerIMPL;
import com.example.demo.layer3.PassengerTikBookIMPL;
import com.example.demo.layer3.SeatTableIMPL;



@SpringBootTest
public class OneToManyPassTblToPassTicket {
 
	@Autowired
	PassengerTikBookIMPL passtik;
	
	@Autowired
	PassengerIMPL passt;
	
	@Autowired
	BusTableIMPL bustt;
	
	@Autowired
	SeatTableIMPL set;
	
   
	@Test
	void onePasstToManyPassTik() {
		
		Passenger_Table passObj1 = passt.selectPassenger(32);
		Bus_Table bus1 = bustt.selectBusTable(6);
		 Seat_Table seatObj= set.selectSeatTable(21);
		 
		Passenger_Ticket_Book passTik1 = new Passenger_Ticket_Book();
		
		passTik1.setSeat(seatObj);
		passTik1.setPasst(passObj1);
		passTik1.setBust(bus1);
		
		passtik.insertPassengerTikBookRecord(passTik1);
	}
}
