package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Passenger_Ticket_Book;

@Repository
public class PassengerTikBookIMPL extends BaseRepository implements PassengerTikBookRepo {

	@Transactional
	public void insertPassengerTikBookRecord(Passenger_Ticket_Book ref) {
// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Override
	public Passenger_Ticket_Book selectPassengerTikBook(int passengerTikBookNumber) {
// TODO Auto-generated method stub
		Passenger_Ticket_Book passTikBookObj = super.find(Passenger_Ticket_Book.class, passengerTikBookNumber);
		return passTikBookObj;
	}

	@Override
	public List<Passenger_Ticket_Book> selectAllPassengerTikBooks() {
// TODO Auto-generated method stub
		List<Passenger_Ticket_Book> passTikBookObj = new ArrayList<Passenger_Ticket_Book>();
		return super.findAll("Passenger_Ticket_Book");
	}

	@Transactional
	public void updatePassengerTikBook(Passenger_Ticket_Book passTikBookObj) {
// TODO Auto-generated method stub
		super.merge(passTikBookObj);

	}

	@Transactional
	public void deletePassengerTikBook(int passTikBookNumber) {
// TODO Auto-generated method stub
		super.remove(Passenger_Ticket_Book.class, passTikBookNumber);

	}

}