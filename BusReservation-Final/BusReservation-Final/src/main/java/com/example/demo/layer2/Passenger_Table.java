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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name="Passenger_Table1")
public class Passenger_Table {
	
	@Id
	@GeneratedValue
	@Column(name="PASSENGER_ID")
	private int passengerid;
	
	@Column(name="FIRST_NAME")
    private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastname;
	
	@Column(name="GENDER")
	private String gender;
	

	@Column(name="DATE_OF_BIRTH")
	private LocalDate dateofBirth;

	


	@ManyToOne 
	@JoinColumn(name="userId")
	private User_Table usert;
	
	
	@OneToMany(mappedBy ="passt",cascade = CascadeType.ALL )
	private Set<Passenger_Ticket_Book> use=new HashSet<Passenger_Ticket_Book>();
	



	public Set<Passenger_Ticket_Book> getUse() {
		return use;
	}


	public void setUse(Set<Passenger_Ticket_Book> use) {
		this.use = use;
	}


	public User_Table getUsert() {
		return usert;
	}


	public void setUsert(User_Table usert) {
		this.usert = usert;
	}


	public int getPassengerid() {
		return passengerid;
	}


	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	
	
	
}
