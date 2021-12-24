package com.example.demo.layer2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


 

@Entity
@Table(name="Bus_Table")
public class Bus_Table {
	
	@Id
	@GeneratedValue
	@Column(name="Bus_Id")
	private int Bus_Id;
	
	@Column(name="Bus_Name")
	private String Bus_Name;
	
	@Column(name="Source_Loc")
	private String Source_Loc;
	
	@Column(name="Destination_Loc")
	private String Destination_Loc;
	
	@Column(name="Date_of_journey")
	private LocalDate Date_of_journey;
	
	@Column(name="AC_Price")
	private float AC_Price;
	
	@Column(name="NONAC_Price")
	private float NONAC_Price;
	
	
	
	@Column(name="Total_Seat")
	private int Total_Seat;
	
	@Column(name="Total_AC_Seats")
	private int Total_AC_Seats;
	
	@Column(name="Total_NONAC_Seats")
	private int Total_NONAC_Seats;
	
	@Column(name="Available_AC_Seats")
	private int Available_AC_Seats;
	
	@Column(name="Available_NONAC_Seats")
	private int Available_NONAC_Seats;
	

	@OneToMany(mappedBy ="bust",cascade = CascadeType.ALL )
	private Set<Passenger_Ticket_Book> use=new HashSet<Passenger_Ticket_Book>();
	
	

	public Set<Passenger_Ticket_Book> getUse() {
		return use;
	}

	public void setUse(Set<Passenger_Ticket_Book> use) {
		this.use = use;
	}

	public int getBus_Id() {
		return Bus_Id;
	}

	public void setBus_Id(int bus_Id) {
		Bus_Id = bus_Id;
	}

	public String getBus_Name() {
		return Bus_Name;
	}

	public void setBus_Name(String bus_Name) {
		Bus_Name = bus_Name;
	}

	public String getSource_Loc() {
		return Source_Loc;
	}

	public void setSource_Loc(String source_Loc) {
		Source_Loc = source_Loc;
	}

	public String getDestination_Loc() {
		return Destination_Loc;
	}

	public void setDestination_Loc(String destination_Loc) {
		Destination_Loc = destination_Loc;
	}

	public LocalDate getDate_of_journey() {
		return Date_of_journey;
	}

	public void setDate_of_journey(LocalDate date_of_journey) {
		Date_of_journey = date_of_journey;
	}



	public float getAC_Price() {
		return AC_Price;
	}

	public void setAC_Price(float aC_Price) {
		AC_Price = aC_Price;
	}

	public float getNONAC_Price() {
		return NONAC_Price;
	}

	public void setNONAC_Price(float nONAC_Price) {
		NONAC_Price = nONAC_Price;
	}

	public int getTotal_Seat() {
		return Total_Seat;
	}

	public void setTotal_Seat(int total_Seat) {
		Total_Seat = total_Seat;
	}

	public int getTotal_AC_Seats() {
		return Total_AC_Seats;
	}

	public void setTotal_AC_Seats(int total_AC_Seats) {
		Total_AC_Seats = total_AC_Seats;
	}

	public int getTotal_NONAC_Seats() {
		return Total_NONAC_Seats;
	}

	public void setTotal_NONAC_Seats(int total_NONAC_Seats) {
		Total_NONAC_Seats = total_NONAC_Seats;
	}

	public int getAvailable_AC_Seats() {
		return Available_AC_Seats;
	}

	public void setAvailable_AC_Seats(int available_AC_Seats) {
		Available_AC_Seats = available_AC_Seats;
	}

	public int getAvailable_NONAC_Seats() {
		return Available_NONAC_Seats;
	}

	public void setAvailable_NONAC_Seats(int available_NONAC_Seats) {
		Available_NONAC_Seats = available_NONAC_Seats;
	}

	@Override
	public String toString() {
		return "Bus_Table [Bus_Id=" + Bus_Id + ", Bus_Name=" + Bus_Name + ", Source_Loc=" + Source_Loc
				+ ", Destination_Loc=" + Destination_Loc + ", Date_of_journey=" + Date_of_journey + ", AC_Price="
				+ AC_Price + ", NONAC_Price=" + NONAC_Price + ", Total_Seat=" + Total_Seat + ", Total_AC_Seats="
				+ Total_AC_Seats + ", Total_NONAC_Seats=" + Total_NONAC_Seats + ", Available_AC_Seats="
				+ Available_AC_Seats + ", Available_NONAC_Seats=" + Available_NONAC_Seats + "]";
	}

	
	
	
	
	
}
