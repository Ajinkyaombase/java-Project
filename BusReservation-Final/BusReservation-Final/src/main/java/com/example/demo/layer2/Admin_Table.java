package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin_Table")
public class Admin_Table {
	
	@Id
	@Column(name="ADMIN_ID")
	private int adminid;
	
	@Column(name="ADMIN_PASSWORD")
	private String adminPassword;

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	


	
}
