package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Seat_Table;
import com.example.demo.layer3.SeatTableIMPL;

@SpringBootTest
public class SeatTableTest {

	@Autowired
	SeatTableIMPL SeatTableRepo;

	@Test
	void insertSeatTable() {

		Seat_Table SeatTableObj = new Seat_Table();
		//SeatTableObj.setSeat_no("AXBZ256");
		SeatTableObj.setSeat_Type("Sleeper");
		SeatTableRepo.insertSeatTableRecord(SeatTableObj);
	}

	@Test
	void updateSeatTable() {
		Seat_Table SeatTableObj = null;
		SeatTableObj = SeatTableRepo.find(Seat_Table.class, 24);
    //   SeatTableObj.setSeat_no("AXBZ234");
		SeatTableObj.setSeat_Type("Seater");
		SeatTableRepo.updateSeatTable(SeatTableObj);

	}

	@Test
	void deleteSeatTable() {
		Seat_Table SeatTableObj = new Seat_Table();
		SeatTableRepo.remove(Seat_Table.class, 20);
	}

	@Test
	void fetchById() {
		Seat_Table SeatTableObj;
		SeatTableObj = SeatTableRepo.selectSeatTable(21);
		System.out.println("Seat_Table Seat_No" + SeatTableObj.getSeat_no());
		System.out.println("Seat_Table Seat_Type: " + SeatTableObj.getSeat_Type());

		System.out.println("-----------------------------------------");
	}

	@Test
	void fetchAllAddress() {
		List<Seat_Table> seat_TablesList;
		seat_TablesList = SeatTableRepo.selectAllSeatTables();
		for (Seat_Table SeatTableObj : seat_TablesList) {

			System.out.println("Seat_Table Seat_No :" + SeatTableObj.getSeat_no());
			System.out.println("Seat_Table Seat_Type :" + SeatTableObj.getSeat_Type());

			System.out.println("-----------------------------------------");
		}
	}

}