package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.TransactionTable;

@Repository
public class TransactionIMPL extends BaseRepository implements TransactionRepo {

	@Transactional
	public void inserttransactionRecord(TransactionTable ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Override
	public TransactionTable selectTransaction(int transactionNumber) {
		// TODO Auto-generated method stub
		TransactionTable transObj=super.find(TransactionTable.class, transactionNumber);
		return transObj;
	}

	@Override
	public List<TransactionTable> selectAllTransactions() {
		// TODO Auto-generated method stub
	List<TransactionTable> transObj=new ArrayList<TransactionTable>();
return	super.findAll("TransactionTable");
	
	}

	@Transactional
	public void updateTransaction(TransactionTable transObj) {
		// TODO Auto-generated method stub
		super.merge(transObj);
		
	}

	@Transactional
	public void deleteTransaction(int transNumber) {
		// TODO Auto-generated method stub
		super.remove(TransactionTable.class, transNumber);
	}

	
	
}
