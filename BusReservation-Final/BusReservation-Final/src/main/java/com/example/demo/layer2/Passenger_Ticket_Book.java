package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passenger_Ticket_Book")
public class Passenger_Ticket_Book {

	
	

	@Id
	@GeneratedValue
	@Column(name="TICKET_Id")
	private int ticketid;
	
	

	@ManyToOne 
	@JoinColumn(name="passT")
	private Passenger_Table passt;
	

	@ManyToOne 
	@JoinColumn(name="bustb")
	private Bus_Table bust;
	
	@ManyToOne
	@JoinColumn(name="seatno")
	private Seat_Table seat;
	
	@ManyToOne
	@JoinColumn(name="PassBookId")
	private Booking_Table bookt;
	
	
//	@Column(name = "passengerId")
//	private Passenger_Table passTab;
//	
//	@Column(name = "seatNumber")
//	private Seat_Table seatTab;
//	
//	@Column(name = "busId")
//	private Bus_Table busTab;

	
	public Booking_Table getBookt() {
		return bookt;
	}

	public void setBookt(Booking_Table bookt) {
		this.bookt = bookt;
	}

	public Seat_Table getSeat() {
		return seat;
	}

	public void setSeat(Seat_Table seat) {
		this.seat = seat;
	}

	public Bus_Table getBust() {
		return bust;
	}

	public void setBust(Bus_Table bust) {
		this.bust = bust;
	}

	public Passenger_Ticket_Book() {
		super();
	}

//	public Passenger_Ticket_Book(Passenger_Table passTab, Seat_Table seatTab, Bus_Table busTab) {
//		super();
//		this.passTab = passTab;
//		this.seatTab = seatTab;
//		this.busTab = busTab;
//	}

//	@Override
//	public String toString() {
//		return "Passenger_Ticket_Book [ticketid=" + ticketid + ", passTab=" + passTab + ", seatTab=" + seatTab
//				+ ", busTab=" + busTab + "]";
//	}

	public int getTicketid() {
		return ticketid;
	}

	public Passenger_Table getPasst() {
		return passt;
	}

	public void setPasst(Passenger_Table passt) {
		this.passt = passt;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	@Override
	public String toString() {
		return "Passenger_Ticket_Book [ticketid=" + ticketid + "]";
	}

//	public Passenger_Table getPassTab() {
//		return passTab;
//	}
//
//	public void setPassTab(Passenger_Table passTab) {
//		this.passTab = passTab;
//	}
//
//	public Seat_Table getSeatTab() {
//		return seatTab;
//	}
//
//	public void setSeatTab(Seat_Table seatTab) {
//		this.seatTab = seatTab;
//	}
//
//	public Bus_Table getBusTab() {
//		return busTab;
//	}
//
//	public void setBusTab(Bus_Table busTab) {
//		this.busTab = busTab;
//	}

	
	
	
}
