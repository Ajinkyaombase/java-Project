package com.example.demo.layer2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Booking_Table1110")
public class Booking_Table {

	@Id
	@GeneratedValue
	@Column(name="Booking_Id")
	private  int Booking_Id;
	
	

	@Column(name="Ac_Seats_Booked")
	private  String Ac_Seats_Booked;
	
	@Column(name="Non_Ac_Seats_Booked")
	private  String Non_Ac_Seats_Booked;
	
	@Column(name="Booking_Date")
	private  LocalDate Booking_Date;
	
	@Column(name="Booking_Status")
	private  String Booking_Status;
	
	 @OneToMany(mappedBy ="bookt",cascade = CascadeType.ALL )
	   private Set<Passenger_Ticket_Book> use=new HashSet<Passenger_Ticket_Book>();
		

	   
	
	public Set<Passenger_Ticket_Book> getUse() {
		return use;
	}
	public void setUse(Set<Passenger_Ticket_Book> use) {
		this.use = use;
	}
	public Booking_Table() {
		super();
	}
	public Booking_Table(String ac_Seats_Booked, String non_Ac_Seats_Booked, LocalDate booking_Date,
			String booking_Status, int total_cost, TransactionTable tranTab) {
		super();
		Ac_Seats_Booked = ac_Seats_Booked;
		Non_Ac_Seats_Booked = non_Ac_Seats_Booked;
		Booking_Date = booking_Date;
		Booking_Status = booking_Status;
		Total_cost = total_cost;
		this.tranTab = tranTab;
	}
	public TransactionTable getTranTab() {
		return tranTab;
	}
	public void setTranTab(TransactionTable tranTab) {
		this.tranTab = tranTab;
	}




	@Column(name="Total_cost")
	private  int Total_cost;
	
	@OneToOne
	@JoinColumn(name = "TransactionTable")
	private TransactionTable tranTab;
	
	
//	@Column(name="return_Id")
//	private  int return_Id;
//		
//	
//	@Column(name="User_Id")
//	private  int User_Id;
//	
//	@Column(name="Bus_Id")
//	private  int Bus_Id;
	
	
	
	
//	@OneToOne
//	private Cancellation_Table cancellation_table;
//
//	
//	public Cancellation_Table getCancellation_table() {
//		return cancellation_table;
//	}
//	public void setCancellation_table(Cancellation_Table cancellation_table) {
//		this.cancellation_table = cancellation_table;
	//}
//	public Transaction_Table getTransaction_table() {
//		return transaction_table;
//	}
//	public void setTransaction_table(Transaction_Table transaction_table) {
//		this.transaction_table = transaction_table;
//	}
	public String getAc_Seats_Booked() {
		return Ac_Seats_Booked;
	}
	public int getBooking_Id() {
		return Booking_Id;
	}
	public void setBooking_Id(int booking_Id) {
		Booking_Id = booking_Id;
	}
	public void setAc_Seats_Booked(String ac_Seats_Booked) {
		Ac_Seats_Booked = ac_Seats_Booked;
	}
	public String getNon_Ac_Seats_Booked() {
		return Non_Ac_Seats_Booked;
	}
	public void setNon_Ac_Seats_Booked(String non_Ac_Seats_Booked) {
		Non_Ac_Seats_Booked = non_Ac_Seats_Booked;
	}
	public LocalDate getBooking_Date() {
		return Booking_Date;
	}
	public void setBooking_Date(LocalDate booking_Date) {
		Booking_Date = booking_Date;
	}
	public String getBooking_Status() {
		return Booking_Status;
	}
	public void setBooking_Status(String booking_Status) {
		Booking_Status = booking_Status;
	}
//	public int getReturn_Id() {
//		return return_Id;
//	}
//	public void setReturn_Id(int return_Id) {
//		this.return_Id = return_Id;
//	}
//	public int getTransaction_Id() {
//		return Transaction_Id;
//	}
//	public void setTransaction_Id(int transaction_Id) {
//		Transaction_Id = transaction_Id;
//	}
//	public int getUser_Id() {
//		return User_Id;
//	}
//	public void setUser_Id(int user_Id) {
//		User_Id = user_Id;
//	}
//	public int getBus_Id() {
//		return Bus_Id;
//	}
//	public void setBus_Id(int bus_Id) {
//		Bus_Id = bus_Id;
//	}
	public int getTotal_cost() {
		return Total_cost;
	}

	
	public void setTotal_cost(int total_cost) {
		Total_cost = total_cost;
	}

	
	
	
	@Override
	public String toString() {
		return "Booking_Table [Booking_Id=" + Booking_Id + ", Ac_Seats_Booked=" + Ac_Seats_Booked
				+ ", Non_Ac_Seats_Booked=" + Non_Ac_Seats_Booked + ", Booking_Date=" + Booking_Date
				+ ", Booking_Status=" + Booking_Status + ", Total_cost=" + Total_cost + ", tranTab=" + tranTab + "]";
	}
	
}
