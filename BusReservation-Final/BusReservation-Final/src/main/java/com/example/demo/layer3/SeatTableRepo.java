package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Seat_Table;

@Repository
public interface SeatTableRepo {
	void insertSeatTableRecord(Seat_Table ref);

	Seat_Table selectSeatTable(int SeatTableNumber);

	List<Seat_Table> selectAllSeatTables();

	void updateSeatTable(Seat_Table SeatTableObj);

	void deleteSeatTable(int SeatTableNumber);

}