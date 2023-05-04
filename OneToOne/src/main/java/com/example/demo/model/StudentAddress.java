package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity

public class StudentAddress {
	@Id
	private String doornum;
	private String street;
	private String city;
	private String pincode;
	public String getDoornum() {
		return doornum;
	}
	public void setDoornum(String doornum) {
		this.doornum = doornum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
