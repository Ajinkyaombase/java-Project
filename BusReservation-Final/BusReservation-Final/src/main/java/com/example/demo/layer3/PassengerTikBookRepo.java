package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Passenger_Ticket_Book;

@Repository
public interface PassengerTikBookRepo {

	void insertPassengerTikBookRecord(Passenger_Ticket_Book ref);

	Passenger_Ticket_Book selectPassengerTikBook(int passengerTikBookNumber);

	List<Passenger_Ticket_Book> selectAllPassengerTikBooks();

	void updatePassengerTikBook(Passenger_Ticket_Book passTikBookObj);

	void deletePassengerTikBook(int passTikBookNumber);

}