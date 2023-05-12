package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person_Main_Test {

	public static void main(String[] args) throws ParseException {

		Person ps = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		ps.setName("Loki");
		ps.setAddress("Asgard Chauraha");
		ps.setDob((sdf.parse("11/11/2011")));
    //    Person.AVG_AGE = 45;    to avoid the changes, we'll declare AVG_AGE final
		
		System.out.println("Name : " + ps.getName());
		System.out.println("Address : " + ps.getAddress());
		System.out.println("Avrage_Age : " + Person.AVG_AGE);
		System.out.println("Avrage Age : "+sdf.format(ps.getDob()));
	}
}