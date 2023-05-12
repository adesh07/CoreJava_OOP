package com.rays.oop;

import java.util.Date;

public class Person {

	private String name = null;
	private Date dob = null;
	private String address = null;
	public static final int AVG_AGE = 25;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    public static int getAVG_AGE() {
	return AVG_AGE;
	}
}