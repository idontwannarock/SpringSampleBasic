package com.wch.spring.beans;

public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName:" + name);
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello: " + name);
	}
	
	public HelloWorld() {
		System.out.println("HelloWorld's constructor...");
	}
	
}
