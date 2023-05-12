package com.constructor.calling;

public class Person {

	protected String FirstName = null;
	protected String LastName = null;
	protected String address = null;

	public Person() {
		System.out.println("Person default costructor");
	}

	public Person(String fn) {
		FirstName = fn;
		System.out.println("1 Parameter constructor is called");
	}

	public Person(String fn, String ln) {
		FirstName = fn;
		LastName = ln;
		System.out.println("2 Parameter constructor is called");
	}

	public Person(String fn, String ln, String address) {
		this(fn);
		FirstName = fn;
		LastName = ln;
		this.address = address;
		System.out.println("3 Parameter constructor is called");
	}

}