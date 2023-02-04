package com.jsp.bike;

public class Bike {
	private String name;
	private String brand;

	public Bike(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}
	
	
	public void printBikeDetails() {
		System.out.println("==========Bike=========");
		System.out.println(name);
		System.out.println(brand);

}
	}
