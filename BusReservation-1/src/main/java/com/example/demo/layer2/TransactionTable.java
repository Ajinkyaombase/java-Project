package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transaction_Table1")
public class TransactionTable {

	@Id
	@Column(name="Transaction_Id")
	private int Transaction_Id;
	
	@Column(name="Transaction_Type")
	private String Transaction_Type;
	
	@Column(name="Transaction_Mode")
	private String Transaction_Mode;
	
	@Column(name="Transaction_Amount")
	private Float Transaction_Amount;
	
	@Column(name="Transaction_Status")
	private String Transaction_Status ;
	
	@OneToOne
	private Booking_Table booking_table;	
	
	
	@OneToOne
	private Cancellation_Table cancellation_table;
	
	
	
	
	
	public Booking_Table getBooking_table() {
		return booking_table;
	}
	public void setBooking_table(Booking_Table booking_table) {
		this.booking_table = booking_table;
	}
	public Cancellation_Table getCancellation_table() {
		return cancellation_table;
	}
	public void setCancellation_table(Cancellation_Table cancellation_table) {
		this.cancellation_table = cancellation_table;
	}
	public int getTransaction_Id() {
		return Transaction_Id;
	}
	public void setTransaction_Id(int transaction_Id) {
		Transaction_Id = transaction_Id;
	}
	public String getTransaction_Type() {
		return Transaction_Type;
	}
	public void setTransaction_Type(String transaction_Type) {
		Transaction_Type = transaction_Type;
	}
	public String getTransaction_Mode() {
		return Transaction_Mode;
	}
	public void setTransaction_Mode(String transaction_Mode) {
		Transaction_Mode = transaction_Mode;
	}
	public Float getTransaction_Amount() {
		return Transaction_Amount;
	}
	public void setTransaction_Amount(Float transaction_Amount) {
		Transaction_Amount = transaction_Amount;
	}
	public String getTransaction_Status() {
		return Transaction_Status;
	}
	public void setTransaction_Status(String transaction_Status) {
		Transaction_Status = transaction_Status;
	}
	@Override
	public String toString() {
		return "TransactionTable [Transaction_Id=" + Transaction_Id + ", Transaction_Type=" + Transaction_Type
				+ ", Transaction_Mode=" + Transaction_Mode + ", Transaction_Amount=" + Transaction_Amount
				+ ", Transaction_Status=" + Transaction_Status + ", booking_table=" + booking_table
				+ ", cancellation_table=" + cancellation_table + "]";
	}
	
	
	
	
}
