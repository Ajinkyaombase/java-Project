package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.TransactionTable;
import com.example.demo.layer3.TransactionIMPL;

@SpringBootTest
class TransactionTests {

	@Autowired
	TransactionIMPL transRepo;
	
	
	@Test
	void insertTransaciton() {
		
		TransactionTable transObj=new TransactionTable();
//		transObj.setTransaction_Id(111);
		transObj.setTransaction_Type("online");
		transObj.setTransaction_Mode("debit");
		transObj.setTransaction_Amount(400f);
		transObj.setTransaction_Status("sucessfull");
	
		transRepo.inserttransactionRecord(transObj);
	}
	@Test
	void updateTransaction() {
		TransactionTable transObj=null;
		transObj=transRepo.find(TransactionTable.class, 107);
		transObj.setTransaction_Type("offline");
		transObj.setTransaction_Mode("credit");
		transObj.setTransaction_Amount(567f);
		transObj.setTransaction_Status("sucessfull");
		transRepo.updateTransaction(transObj);
	}
	
	@Test
	void deleteTransaction() {
		TransactionTable transObj=new TransactionTable();
		transRepo.remove(TransactionTable.class, 101);
	}
	
	
	@Test
	 void fetchById() {
		TransactionTable transObj;
		transObj=transRepo.selectTransaction(4);
	  System.out.println("TransactionTable Transaction_Type :"+transObj.getTransaction_Type());
	  System.out.println("TransactionTable Transaction_Mode"+transObj.getTransaction_Mode());
	  System.out.println("TransactionTable Transaction_Amount: "+transObj.getTransaction_Amount());
	  System.out.println("TransactionTable Transaction_Status :"+transObj.getTransaction_Status());
	  
	  System.out.println("-----------------------------------------");
	 }
	
	
	 @Test
	 void fetchAllAddress() {
	  List<TransactionTable> transList;
	  transList=transRepo.selectAllTransactions();
	  for(TransactionTable
			  trans: transList)
	  {

		  System.out.println("TransactionTable Transaction_Id :"+trans.getTransaction_Id());
		  System.out.println("TransactionTable Transaction_Type :"+trans.getTransaction_Type());
		  System.out.println("TransactionTable Transaction_Mode"+trans.getTransaction_Mode());
		  System.out.println("TransactionTable Transaction_Amount: "+trans.getTransaction_Amount());
		  System.out.println("TransactionTable Transaction_Status :"+trans.getTransaction_Status());
		  
		  System.out.println("-----------------------------------------");
	  }
	 }
}
