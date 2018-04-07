package com.wch.spring.beans.spel;

public class Car {

	private String brand;
	private double price;
	private double tirePerimeter; // 輪胎的週長

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTirePerimeter() {
		return tirePerimeter;
	}

	public void setTirePerimeter(double tirePerimeter) {
		this.tirePerimeter = tirePerimeter;
	}

	public Car() {
		System.out.println("Car's Constructor...");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tirePerimeter=" + tirePerimeter + "]";
	}

}
