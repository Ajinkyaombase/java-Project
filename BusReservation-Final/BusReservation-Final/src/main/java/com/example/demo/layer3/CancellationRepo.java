package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Cancellation_Table;



@Repository
public interface CancellationRepo {

	void insertcancellationRecord(Cancellation_Table ref);

	Cancellation_Table selectCancellation(int cancellationNumber);
	List<Cancellation_Table> selectAllCancellations() ;


	void updateCancellation(Cancellation_Table cancObj)  ;
	void deleteCancellation(int  cancNumber)  ;
}


