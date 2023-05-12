package com.inheritance.new1;

public class Triangle_cnstr extends Shape_cnstr {

	private double tarea;

	public Triangle_cnstr() {
	}

	public Triangle_cnstr(int base, int height) {
		this.tarea = (base * height) / 2;
		System.out.println("Trianlge area = " + tarea);
	}

	public double area() {
		return tarea;
	}
}
