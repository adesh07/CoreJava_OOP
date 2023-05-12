package com.constructor.calling;

public class Super_call extends Person {

	private String designation = null;

	public Super_call() {
	}

	public Super_call(String f, String l, String des) {
		
		super(f,l);
		
		designation = des;
		
		System.out.println("3 Parameter (child) constructor is called");
	}

}
