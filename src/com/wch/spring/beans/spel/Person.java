package com.wch.spring.beans.spel;

public class Person {

	private String name;
	private Car car;
	private String city; // 引用Address bean的city屬性
	private String info; // 根據Car的price確定info: car的price>=1500000: 金領；否則為: 白領

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	}

}
