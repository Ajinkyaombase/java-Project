package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Seat_Table;

@Repository
public class SeatTableIMPL extends BaseRepository implements SeatTableRepo {

	@Transactional
	public void insertSeatTableRecord(Seat_Table ref) {
// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Override
	public Seat_Table selectSeatTable(int SeatTableNumber) {
// TODO Auto-generated method stub
		Seat_Table SeatTableObj = super.find(Seat_Table.class, SeatTableNumber);
		return SeatTableObj;
	}

	@Override
	public List<Seat_Table> selectAllSeatTables() {
// TODO Auto-generated method stub
		List<Seat_Table> SeatTableObj = new ArrayList<Seat_Table>();
		return super.findAll("Seat_Table");
	}

	@Transactional
	public void updateSeatTable(Seat_Table SeatTableObj) {
// TODO Auto-generated method stub
		super.merge(SeatTableObj);
	}

	@Transactional
	public void deleteSeatTable(int SeatTableNumber) {
// TODO Auto-generated method stub
		super.remove(Seat_Table.class, SeatTableNumber);

	}


}