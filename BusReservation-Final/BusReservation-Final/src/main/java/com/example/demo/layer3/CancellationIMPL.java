package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Cancellation_Table;


@Repository
public class CancellationIMPL extends BaseRepository implements CancellationRepo{
	
	
    @Transactional
	public void insertcancellationRecord(Cancellation_Table ref) {
		// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Override
	public Cancellation_Table selectCancellation(int cancellationNumber) {
		// TODO Auto-generated method stub
		Cancellation_Table cancObj=super.find(Cancellation_Table.class, cancellationNumber);
		return cancObj;
	}

	@Override
	public List<Cancellation_Table> selectAllCancellations() {
		// TODO Auto-generated method stub
		List<Cancellation_Table> cancObj=new ArrayList<Cancellation_Table>();
		return super.findAll("Cancellation_Table");
	}

	@Transactional
	public void updateCancellation(Cancellation_Table cancObj) {
		// TODO Auto-generated method stub
		super.merge(cancObj);
		
	}

	@Transactional
	public void deleteCancellation(int cancNumber) {
		// TODO Auto-generated method stub
		super.remove(Cancellation_Table.class, cancNumber);	
	}

}
