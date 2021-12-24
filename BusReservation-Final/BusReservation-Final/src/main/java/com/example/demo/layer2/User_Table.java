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
@Table(name="User_Table01")
public class User_Table {
	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int userid;
	
	@Column(name="REGISTERED_EMAIL")
	private String registeredEmail;
	
	@Column(name="FIRST_NAME")
    private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastname;
	
	@Column(name="PHONE_NUMBER")
	private float phoneNumber;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="DATE_OF_BIRTH")
	private LocalDate dateofBirth;

	@OneToMany(mappedBy ="usert",cascade = CascadeType.ALL )
	private Set<Passenger_Table> use=new HashSet<Passenger_Table>();
	
	

	public Set<Passenger_Table> getUse() {
		return use;
	}

	public void setUse(Set<Passenger_Table> use) {
		this.use = use;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getRegisteredEmail() {
		return registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
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

	public float getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(float phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	
	

}
