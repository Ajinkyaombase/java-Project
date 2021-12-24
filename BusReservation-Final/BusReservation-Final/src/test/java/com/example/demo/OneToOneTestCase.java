package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Booking_Table;
import com.example.demo.layer2.Cancellation_Table;
import com.example.demo.layer2.TransactionTable;
import com.example.demo.layer3.BookingImpl;
import com.example.demo.layer3.CancellationIMPL;
import com.example.demo.layer3.TransactionIMPL;

@SpringBootTest
public class OneToOneTestCase {
	 
	@Autowired
	BookingImpl bkt;
	
	@Autowired
	TransactionIMPL trn;
	
	@Autowired
	CancellationIMPL cancRepo;
	
	
	
	@Test
	void assignOneTableToCancellation() {
	
		Booking_Table bktb=bkt.find(Booking_Table.class, 4 );
		
		TransactionTable trns=trn.find(TransactionTable.class, 5);
		
		bktb.setTranTab(trns);
		trns.setBookTab(bktb);
		
		bkt.merge(bktb);
		trn.merge(trns);
		
	}
	
	 @Test
	    public void insertBookingWithTransactionTest() {
	    	
	        Booking_Table bkt2 =new Booking_Table();
	        
	        bkt2.setAc_Seats_Booked("ac _seat book");
	        bkt2.setNon_Ac_Seats_Booked("non AC");
	        bkt2.setBooking_Date(LocalDate.of(2021,11,11));
	        bkt2.setBooking_Status("done");
	        bkt2.setTotal_cost(200);
	        
	        TransactionTable tranObj1 = trn.selectTransaction(6);
	        
	        bkt2.setTranTab(tranObj1);
	        
	        bkt.insertbookingRecord(bkt2);   
	    }
	 
		@Test
		void insertCanWithTranTest() {
			
			Cancellation_Table canObj1 = new Cancellation_Table();
			
			canObj1.setCancellation_Date(null);
			canObj1.setCancellation_status("Success");
			canObj1.setRefund_Amount(150f);
			
			TransactionTable tranObj1 = trn.selectTransaction(5);
			
			canObj1.setTransactionTable(tranObj1);
			
			cancRepo.insertcancellationRecord(canObj1);
			
		}
	

		@Test
		void assignTransactionToCancellation() {
			
			TransactionTable trns=trn.find(TransactionTable.class, 7);
		
			Cancellation_Table cans=bkt.find(Cancellation_Table.class, 9 );
			
			cans.setTransactionTable(trns);
			trns.setCansTab(cans);
			
			cancRepo.merge(trns);
			trn.merge(cans);
			
		}
	
	
	
	
	
//	@Test
//	 void assignExistingInsurenceRequestToExistingPolicyDEtails() {
//
//	  InsuranceRequest insuranceReqObj = insuranceReqRepo1.find(InsuranceRequest.class, 109);
//
//	  PolicyDetails policyDetailsObj = policyDetailsRepo.find(PolicyDetails.class, 139);
//
//	  insuranceReqObj.setPolicyDetailsObj(policyDetailsObj);// are we setting the FK?
//	  policyDetailsObj.setInsReqPojo(insuranceReqObj);
//
//	  insuranceReqRepo1.merge(insuranceReqObj);
//	  policyDetailsRepo.merge(policyDetailsObj);
//
//	 }


}
