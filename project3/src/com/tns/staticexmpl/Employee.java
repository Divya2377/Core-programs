package com.tns.staticexmpl;
//program to demonstrate static variable

public class Employee {
	private String name;
	private int id;
	
	static String companyname="Tns";
	//declare parametrized constructor

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",companyname=" +companyname +"]";
	}

	

	

}
