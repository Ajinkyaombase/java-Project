package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Bus_Table;


@Repository
public class BusTableIMPL extends BaseRepository implements BusTableRepoo {

	@Transactional
	public void insertbusTableRecord(Bus_Table ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Override
	public Bus_Table selectBusTable(int busNumber) {
		// TODO Auto-generated method stub
		Bus_Table busObj=super.find(Bus_Table.class, busNumber);
		return busObj;
	}

	@Override
	public List<Bus_Table> selectAllBusTable() {
		// TODO Auto-generated method stub
		List<Bus_Table> busObj=new ArrayList<Bus_Table>();
		return super.findAll("Bus_Table");
	}

	@Transactional
	public void updateBusTable(Bus_Table busObj) {
		// TODO Auto-generated method stub
		super.merge(busObj);
	}

	@Transactional
	public void deleteBusTable(int busNumber) {
		// TODO Auto-generated method stub
	super.remove(Bus_Table.class, busNumber);	
	}

}
