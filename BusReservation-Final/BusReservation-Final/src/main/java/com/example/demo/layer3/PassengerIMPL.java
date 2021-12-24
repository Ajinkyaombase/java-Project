package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Passenger_Table;

@Repository
public class PassengerIMPL extends BaseRepository implements PassengerRepo {

	@Transactional
	public void insertpassengerRecord(Passenger_Table ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Override
	public Passenger_Table selectPassenger(int passengerNumber) {
		// TODO Auto-generated method stub
		Passenger_Table pasgObj=super.find(Passenger_Table.class, passengerNumber);
		return pasgObj;
	}

	@Override
	public List<Passenger_Table> selectAllPassenger() {
		// TODO Auto-generated method stub
		List<Passenger_Table> pasgObj=new ArrayList<Passenger_Table>();
		return super.findAll("Passenger_Table");
	}

	@Transactional
	public void updatePassenger(Passenger_Table pasgObj) {
		// TODO Auto-generated method stub
		super.merge(pasgObj);
	}

	@Transactional
	public void deletePassenger(int pasgNumber) {
		// TODO Auto-generated method stub
		super.remove(Passenger_Table.class, pasgNumber);	
	}

}
