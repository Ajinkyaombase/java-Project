package com.example.demo;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.layer2.Passenger_Ticket_Book;
import com.example.demo.layer3.BusTableIMPL;
import com.example.demo.layer3.PassengerIMPL;
import com.example.demo.layer3.PassengerTikBookIMPL;
import com.example.demo.layer3.SeatTableIMPL;

@SpringBootTest
public class PassengerTikBookTest {

	@Autowired
	PassengerTikBookIMPL passRepo;
	
	@Autowired
	PassengerIMPL passengerRepo;
	
	@Autowired
	SeatTableIMPL seatRepo;
	
	@Autowired
	BusTableIMPL busRepo;
	
	@Test
	void insertPassengerTikBooking() {
		
		Passenger_Ticket_Book passObj = new Passenger_Ticket_Book();
		
//		Passenger_Table passObj1 = passengerRepo.selectPassenger(10);
//		Seat_Table seatObj1 = seatRepo.selectSeatTable(24);
//		Bus_Table busObj1 = busRepo.selectBusTable(8);
		
		passRepo.insertPassengerTikBookRecord(passObj);
		
	}
	
	@Test
	void deletePassengerTikBooking() {
		
		Passenger_Ticket_Book passObj = new Passenger_Ticket_Book();
		
		passRepo.deletePassengerTikBook(25);
		
	}
	
	
	@Test
	void selectPassengerTikBooking() {
		
		Passenger_Ticket_Book passObj = passRepo.selectPassengerTikBook(26);
		
		System.out.println("Id = " + passObj.getTicketid());
		
	}
	
	@Test
	void selectAllPassengerTikBooking() {
		
		List<Passenger_Ticket_Book> passList;
		
		passList=passRepo.selectAllPassengerTikBooks();
		
		for(Passenger_Ticket_Book passObj : passList) {
			System.out.println("Id = " + passObj.getTicketid());
		}
		}
		
		
	}
	
	
	
	
	
	
	
	
	



