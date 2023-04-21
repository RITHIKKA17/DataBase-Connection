package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bike")
public class BikeModel {
	@Id
	@Column(name="bid")
	private int bid;
	private String bname;
	private int bmodel;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBmodel() {
		return bmodel;
	}
	public void setBmodel(int bmodel) {
		this.bmodel = bmodel;
	}

}
