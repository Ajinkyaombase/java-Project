package com.example.demo.layer2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transaction_Table2")
public class TransactionTable {

	@Id
	@GeneratedValue
	@Column(name="Transaction_Id")
	private int Transaction_Id;
	
	
	public TransactionTable(String transaction_Type, String transaction_Mode, Float transaction_Amount,
			String transaction_Status, Cancellation_Table cansTab, Booking_Table bookTab) {
		super();
		Transaction_Type = transaction_Type;
		Transaction_Mode = transaction_Mode;
		Transaction_Amount = transaction_Amount;
		Transaction_Status = transaction_Status;
		this.cansTab = cansTab;
		this.bookTab = bookTab;
	}
	public Cancellation_Table getCansTab() {
		return cansTab;
	}
	public void setCansTab(Cancellation_Table cansTab) {
		this.cansTab = cansTab;
	}
	@Column(name="Transaction_Type")
	private String Transaction_Type;
	
	@Column(name="Transaction_Mode")
	private String Transaction_Mode;
	
	@Column(name="Transaction_Amount")
	private Float Transaction_Amount;
	
	@Column(name="Transaction_Status")
	private String Transaction_Status ;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "transactionTable")
	private Cancellation_Table cansTab;
	
	public TransactionTable() {
		super();
	}


	@OneToOne/*(cascade = CascadeType.ALL,mappedBy = "tranTab")*/
	private Booking_Table bookTab;
	
	
		public Booking_Table getBookTab() {
		return bookTab;
	}
	public void setBookTab(Booking_Table bookTab) {
		this.bookTab = bookTab;
	}
//	@OneToOne
//	private Booking_Table booking_table;	
//	
//	
//	@OneToOne
//	private Cancellation_Table cancellation_table;
//	
//	
	
	
//	
//	public Booking_Table getBooking_table() {
//		return booking_table;
//	}
//	public void setBooking_table(Booking_Table booking_table) {
//		this.booking_table = booking_table;
//	}
//	public Cancellation_Table getCancellation_table() {
//		return cancellation_table;
//	}
//	public void setCancellation_table(Cancellation_Table cancellation_table) {
//		this.cancellation_table = cancellation_table;
//	}
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
				+ ", Transaction_Status=" + Transaction_Status + ", cansTab=" + cansTab + ", bookTab=" + bookTab + "]";
	}
	
	
	
	
	
}
