package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Booking_Table;
import com.example.demo.layer2.Passenger_Ticket_Book;
import com.example.demo.layer3.BookingImpl;
import com.example.demo.layer3.PassengerTikBookIMPL;

@SpringBootTest
public class OneToManyBooktToTik {
	
	@Autowired
	BookingImpl book;
	
	@Autowired
	PassengerTikBookIMPL passt;
	
	
	@Test
	void oneToManyBookToTik () {
		
		Booking_Table bookObj= book.selectBooking(14);
		
		Passenger_Ticket_Book passTik1 = new Passenger_Ticket_Book();
      
		passTik1.setBookt(bookObj);
		passt.insertPassengerTikBookRecord(passTik1);
	}

}
