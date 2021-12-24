package com.example.demo.layer2;

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
@Table(name= "BUS_SEAT_DETAILS")
public class Seat_Table {

	

	@Id
	@GeneratedValue
	@Column(name="Seat_No")
	 private int Seat_no;
	

	
	@Column(name="Seat_Type")
	 private String Seat_Type;

   @OneToMany(mappedBy ="seat",cascade = CascadeType.ALL )
   private Set<Passenger_Ticket_Book> use=new HashSet<Passenger_Ticket_Book>();
	

	public Set<Passenger_Ticket_Book> getUse() {
	return use;
}



public void setUse(Set<Passenger_Ticket_Book> use) {
	this.use = use;
}



	public int getSeat_no() {
		return Seat_no;
	}



	public void setSeat_no(int seat_no) {
		Seat_no = seat_no;
	}



	public String getSeat_Type() {
		return Seat_Type;
	}



	public void setSeat_Type(String seat_Type) {
		Seat_Type = seat_Type;
	}
}
