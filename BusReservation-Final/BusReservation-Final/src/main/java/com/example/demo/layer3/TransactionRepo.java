package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.TransactionTable;


@Repository
public interface TransactionRepo {
	void inserttransactionRecord(TransactionTable ref);

	TransactionTable selectTransaction(int transactionNumber);
	List<TransactionTable> selectAllTransactions() ;


	void updateTransaction(TransactionTable transObj)  ;
	void deleteTransaction(int  transNumber)  ;
}
