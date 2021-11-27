package com.example.demo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Booking_Table;
import com.example.demo.layer2.Cancellation_Table;
import com.example.demo.layer2.TransactionTable;

@SpringBootTest
class BusReservation1ApplicationTests {


		
//		
//		@Test
//		public void insertBookingTable() {
//			EntityManagerFactory entityManagerFactory = 
//					Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
//			
//			System.out.println("Entity Manager Factory : "+entityManagerFactory);
//			
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			//ctrl+shift+M
//			
//			System.out.println("Entity Manager : "+entityManager);
//			
//			EntityTransaction transaction = entityManager.getTransaction();
//			transaction.begin();
//			
//			Booking_Table bkt= new Booking_Table();
//				
//				
//				//new/blank entity object
//			 bkt.setBooking_Id(15);
//			bkt.setAc_Seats_Booked("Ac seats booked");
//		    bkt.setBooking_Status("book status");
//		    bkt.setBooking_Date(LocalDate.of(2021,12,11));
//		   
//		    bkt.setNon_Ac_Seats_Booked("non AC");
//		    bkt.setReturn_Id(67);
//		    bkt.setTotal_cost(260);
//		  
//		
//			
//							
//				entityManager.persist(bkt); //generate the insert query for us 
//			transaction.commit();
//		
//		
//
//		
//	}

	
//
//	@Test
//	public void insertCancellation_Table() {
//		EntityManagerFactory entityManagerFactory = 
//				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
//		
//		System.out.println("Entity Manager Factory : "+entityManagerFactory);
//		
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		//ctrl+shift+M
//		
//		System.out.println("Entity Manager : "+entityManager);
//		
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		
//		Cancellation_Table can= new Cancellation_Table();
//			
//			
//			//new/blank entity object
//		can.setCancellation_Id(22);
//		can.setCancellation_Date(LocalDate.of(2021,10, 11));
//	    can.setCancellation_status("cancel succesfull");
//	    can.setRefund_Amount(220.12f);
//	    
//		
//						
//			entityManager.persist(can); //generate the insert query for us 
//		transaction.commit();
//	
//	
//
//	
//}

	@Test
	public void insertTransactionTable() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 
		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		
		System.out.println("Entity Manager : "+entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		TransactionTable tan= new TransactionTable();
			
			
			//new/blank entity object
		tan.setTransaction_Id(216);
		tan.setTransaction_Type("Debit");
		tan.setTransaction_Mode("Online");
		tan.setTransaction_Amount(220.2f);
		tan.setTransaction_Status("Succesfully");
	    
		
						
			entityManager.persist(tan); //generate the insert query for us 
		transaction.commit();
	
	

	
}

}
