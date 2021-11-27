package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cancellation_Table")
public class Cancellation_Table {
 
	@Id
	@Column(name="Cancellation_Id")
	private int Cancellation_Id;
	

	@Column(name="Cancellation_Date")
	   private LocalDate Cancellation_Date;
	
	@Column(name="Cancellation_status")
	   private String Cancellation_status;
	
	@Column(name="Refund_Amount")
	   private Float Refund_Amount;
	
	@OneToOne
	private TransactionTable transactiontable;
	
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

	public TransactionTable getTransactiontable() {
		return transactiontable;
	}

	public void setTransactiontable(TransactionTable transactiontable) {
		this.transactiontable = transactiontable;
	}

	public Booking_Table getBooking_table() {
		return booking_table;
	}

	public void setBooking_table(Booking_Table booking_table) {
		this.booking_table = booking_table;
	}

	@OneToOne 
	private Booking_Table booking_table;

	@Override
	public String toString() {
		return "Cancellation_Table [Cancellation_Id=" + Cancellation_Id + ", Cancellation_Date=" + Cancellation_Date
				+ ", Cancellation_status=" + Cancellation_status + ", Refund_Amount=" + Refund_Amount
				+ ", transactiontable=" + transactiontable + ", booking_table=" + booking_table + "]";
	}
	
	
	
}
