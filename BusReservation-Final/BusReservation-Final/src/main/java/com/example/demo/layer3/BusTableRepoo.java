package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Bus_Table;
@Repository
public interface BusTableRepoo {
	void insertbusTableRecord(Bus_Table ref);

	Bus_Table selectBusTable(int busNumber);
	List<Bus_Table> selectAllBusTable() ;


	void updateBusTable(Bus_Table busObj)  ;
	void deleteBusTable(int  busNumber)  ;
}
