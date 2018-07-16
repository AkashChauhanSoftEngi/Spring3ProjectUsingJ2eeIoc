package com.java.spring;

public class Teacher {
	private String name;

	private Teacher(){
		System.out.println("Accesing private Constructor");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("Hello This is, " + name);
	}

}
