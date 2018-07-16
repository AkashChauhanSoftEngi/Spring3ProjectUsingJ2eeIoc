package com.java.spring;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public Student() {
		System.out.println("Student Object Created");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello This is, " + name);
	}
}
