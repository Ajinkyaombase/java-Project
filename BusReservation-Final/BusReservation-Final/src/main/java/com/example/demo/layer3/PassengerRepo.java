package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Passenger_Table;


@Repository
public interface PassengerRepo {

	void insertpassengerRecord(Passenger_Table ref);

	Passenger_Table selectPassenger(int passengerNumber);
	
	
	List<Passenger_Table> selectAllPassenger() ;


	void updatePassenger(Passenger_Table pasgObj);
	
	
	void deletePassenger(int  pasgNumber);
}
