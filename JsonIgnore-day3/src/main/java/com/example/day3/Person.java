package com.example.day3;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
	public Person(int pid, String pname, String page) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
	}
	private int pid;
	private String pname;
	@JsonIgnore
	private String page;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", page=" + page + "]";
	}

}
