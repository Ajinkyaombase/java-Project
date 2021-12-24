package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Bus_Table;
import com.example.demo.layer2.Cancellation_Table;
import com.example.demo.layer3.BusTableIMPL;

@SpringBootTest
public class BusTableTest {

	@Autowired
	BusTableIMPL busTRepo;
	
	@Test
	void insertBusTable() {
		
		LocalDate ld=LocalDate.of(2021, 10, 6);
		Bus_Table busObj=new Bus_Table();
		busObj.setBus_Name("Shivshahi");
		busObj.setSource_Loc("Mumbai");
		busObj.setDestination_Loc("Kolhapur");
		busObj.setDate_of_journey(ld);
		busObj.setAC_Price(900f);
		busObj.setNONAC_Price(450f);
		busObj.setTotal_Seat(56);
		busObj.setTotal_AC_Seats(56);
		busObj.setTotal_NONAC_Seats(0);
		busObj.setAvailable_AC_Seats(30);
		busObj.setAvailable_NONAC_Seats(0);
		busTRepo.insertbusTableRecord(busObj);
	}
	
	
	@Test
	void updateBusTable() {
		
		LocalDate ld=LocalDate.of(2021, 10, 6);
		Bus_Table busObj=null;
		busObj=busTRepo.find(Bus_Table.class, 8);
		busObj.setBus_Name("Shivshahi");
		busObj.setSource_Loc("Mumbai");
		busObj.setDestination_Loc("Kolhapur");
		busObj.setDate_of_journey(ld);
		busObj.setAC_Price(800f);
		busObj.setNONAC_Price(400f);
		busObj.setTotal_Seat(56);
		busObj.setTotal_AC_Seats(56);
		busObj.setTotal_NONAC_Seats(0);
		busObj.setAvailable_AC_Seats(30);
		busObj.setAvailable_NONAC_Seats(0);
		busTRepo.updateBusTable(busObj);
	
	}
	
	@Test
	void deleteBusTable() {
		Bus_Table busObj=new Bus_Table();
		busTRepo.remove(Bus_Table.class, 9);
	}
	

	@Test
	 void fetchById() {
		Bus_Table busObj;
		busObj=busTRepo.selectBusTable(6);
	  System.out.println("Bus_Table Bus_Name :"+busObj.getBus_Name());
	  System.out.println("Bus_Table Source_Loc  : "+busObj.getSource_Loc());
	  System.out.println("Bus_Table Destination_Loc :"+busObj.getDestination_Loc());
	  System.out.println("Bus_Table Date_of_journey: "+busObj.getDate_of_journey());
	  System.out.println("Bus_Table AC_Price: "+busObj.getAC_Price());
	  System.out.println("Bus_Table NONAC_Price: "+busObj.getNONAC_Price());
	  System.out.println("Bus_Table Total_Seat: "+busObj.getTotal_Seat());
	  System.out.println("Bus_Table Total_AC_Seats: "+busObj.getTotal_AC_Seats());
	  System.out.println("Bus_Table Total_NONAC_Seats: "+busObj.getTotal_NONAC_Seats());
	  System.out.println("Bus_Table Available_AC_Seats: "+busObj.getAvailable_AC_Seats());
	  System.out.println("Bus_Table Available_NONAC_Seats: "+busObj.getAvailable_NONAC_Seats());
	  
	  System.out.println("-----------------------------------------");
	 }
	
	 @Test
	 void fetchAllAddress() {
	  List<Bus_Table> bustList;
	  bustList=busTRepo.selectAllBusTable();
	  for(Bus_Table
			  busObj: bustList)
	  {

		  System.out.println("Bus_Table Bus_Name :"+busObj.getBus_Name());
		  System.out.println("Bus_Table Source_Loc  : "+busObj.getSource_Loc());
		  System.out.println("Bus_Table Destination_Loc :"+busObj.getDestination_Loc());
		  System.out.println("Bus_Table Date_of_journey: "+busObj.getDate_of_journey());
		  System.out.println("Bus_Table AC_Price: "+busObj.getAC_Price());
		  System.out.println("Bus_Table NONAC_Price: "+busObj.getNONAC_Price());
		  System.out.println("Bus_Table Total_Seat: "+busObj.getTotal_Seat());
		  System.out.println("Bus_Table Total_AC_Seats: "+busObj.getTotal_AC_Seats());
		  System.out.println("Bus_Table Total_NONAC_Seats: "+busObj.getTotal_NONAC_Seats());
		  System.out.println("Bus_Table Available_AC_Seats: "+busObj.getAvailable_AC_Seats());
		  System.out.println("Bus_Table Available_NONAC_Seats: "+busObj.getAvailable_NONAC_Seats());
		  
		 
		  
		  System.out.println("-----------------------------------------");
	  };
	 }
}
	

