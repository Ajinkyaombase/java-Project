package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cancellation_Table01")
public class Cancellation_Table {
 
	@Id
	@GeneratedValue
	@Column(name="Cancellation_Id")
	private int Cancellation_Id;
	

	@Column(name="Cancellation_Date")
	   private LocalDate Cancellation_Date;
	
	@Column(name="Cancellation_status")
	   private String Cancellation_status;
	
	@Column(name="Refund_Amount")
	   private Float Refund_Amount;
	
	public Cancellation_Table() {
		super();
	}

	public Cancellation_Table(LocalDate cancellation_Date, String cancellation_status, Float refund_Amount,
			TransactionTable transactionTable) {
		super();
		Cancellation_Date = cancellation_Date;
		Cancellation_status = cancellation_status;
		Refund_Amount = refund_Amount;
		this.transactionTable = transactionTable;
	}

	public TransactionTable getTransactionTable() {
		return transactionTable;
	}

	public void setTransactionTable(TransactionTable transactionTable) {
		this.transactionTable = transactionTable;
	}

	@OneToOne
	@JoinColumn(name = "TransactionId")
	private TransactionTable transactionTable;
	
	public int getCancellation_Id() {
		return Cancellation_Id;
	}

	public void setCancellation_Id(int cancellation_Id) {
		Cancellation_Id = cancellation_Id;
	}

	public LocalDate getCancellation_Date() {
		return Cancellation_Date;
	}

	public void setCancellation_Date(LocalDate cancellation_Date) {
		Cancellation_Date = cancellation_Date;
	}

	public String getCancellation_status() {
		return Cancellation_status;
	}

	public void setCancellation_status(String cancellation_status) {
		Cancellation_status = cancellation_status;
	}

	public Float getRefund_Amount() {
		return Refund_Amount;
	}

	public void setRefund_Amount(Float refund_Amount) {
		Refund_Amount = refund_Amount;
	}

//	public TransactionTable getTransactiontable() {
//		return transactiontable;
//	}
//
//	public void setTransactiontable(TransactionTable transactiontable) {
//		this.transactiontable = transactiontable;
//	}


	

	@Override
	public String toString() {
		return "Cancellation_Table [Cancellation_Id=" + Cancellation_Id + ", Cancellation_Date=" + Cancellation_Date
				+ ", Cancellation_status=" + Cancellation_status + ", Refund_Amount=" + Refund_Amount
				+ ", transactionTable=" + transactionTable + "]";
	}
	
	
	
}
