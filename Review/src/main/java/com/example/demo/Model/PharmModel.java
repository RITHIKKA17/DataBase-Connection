package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Drugs")
public class PharmModel {
	@Id
	@Column(name="id")
	private int id;
	private String name;
	private String type;
	private String manufacturer;
	private double price;
	private String expiry_date;
	private String date_received;
	private String dosage;
	private String storage_conditions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getDate_received() {
		return date_received;
	}
	public void setDate_received(String date_received) {
		this.date_received = date_received;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getStorage_conditions() {
		return storage_conditions;
	}
	public void setStorage_conditions(String storage_conditions) {
		this.storage_conditions = storage_conditions;
	}
	

}
