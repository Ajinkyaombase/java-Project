package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Cancellation_Table;
import com.example.demo.layer2.TransactionTable;
import com.example.demo.layer3.CancellationIMPL;
import com.example.demo.layer3.TransactionIMPL;

@SpringBootTest
public class CancellationTest {

	@Autowired
	CancellationIMPL cancRepo;
	
	@Autowired
	TransactionIMPL tranRepo;
	
	@Test
	void insertCancellation() {
		
		LocalDate ld=LocalDate.of(2020, 4, 8);
	Cancellation_Table cancObj=new Cancellation_Table();
	cancObj.setCancellation_Date(ld);
	cancObj.setCancellation_status("successful");
	cancObj.setRefund_Amount(200f);
	cancRepo.insertcancellationRecord(cancObj);
	}
	
	
	@Test
	void insertCanWithTranTest() {
		
		Cancellation_Table canObj1 = new Cancellation_Table();
		
		canObj1.setCancellation_Date(null);
		canObj1.setCancellation_status("Success");
		canObj1.setRefund_Amount(150f);
		
		TransactionTable tranObj1 = tranRepo.selectTransaction(5);
		
		canObj1.setTransactionTable(tranObj1);
		
		cancRepo.insertcancellationRecord(canObj1);
		
	}
	
	
	@Test
	void updateCancellation() {
		Cancellation_Table cancObj=null;
		cancObj=cancRepo.find(Cancellation_Table.class, 2);
		cancObj.setCancellation_Date(LocalDate.of(2021, 11,10));
		cancObj.setCancellation_status("Succesfully");
		cancObj.setRefund_Amount(340f);
		
	
	}
	
	@Test
	void deleteCancellation() {
		Cancellation_Table cancObj=new Cancellation_Table();
		cancRepo.remove(Cancellation_Table.class, 2);
	}
	
	
	

	@Test
	 void fetchById() {
		Cancellation_Table cancObj;
		cancObj=cancRepo.selectCancellation(1);
	  System.out.println("Cancellation_Table Cancellation_Date:"+cancObj.getCancellation_Date());
	  System.out.println("Cancellation_Table Cancellation_status: "+cancObj.getCancellation_status());
	  System.out.println("Cancellation_Table Refund_Amount :"+cancObj.getRefund_Amount());
	  
	  System.out.println("-----------------------------------------");
	 }
	
	
	 @Test
	 void fetchAllAddress() {
	  List<Cancellation_Table> cancList;
	  cancList=cancRepo.selectAllCancellations();
	  for(Cancellation_Table
			  cancObj: cancList)
	  {

		  System.out.println("Cancellation_Table Cancellation_Id :"+cancObj.getCancellation_Id());
		  System.out.println("Cancellation_Table Cancellation_Date :"+cancObj.getCancellation_Date());
		  System.out.println("Cancellation_Table Cancellation_status"+cancObj.getCancellation_status());
		  System.out.println("Cancellation_Table Refund_Amount: "+cancObj.getRefund_Amount());
		  
		  
		  System.out.println("-----------------------------------------");
	  }
	 }
}
