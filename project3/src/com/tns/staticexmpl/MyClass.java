package com.tns.staticexmpl;
//program to demonstrate static method and block

public class MyClass {
	private int section;//instance variable
	private static int slno;//static variable
	//static block
	static
	{
		System.out.println("-------Static block------");
		slno=100;
	}
	//default constructor
	MyClass(){
		System.out.println("----default constructor-----");
		slno++;
		section++;
	}
	//static method
	static void display() {
		System.out.println("Serial no"+slno);
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
	
	

}
