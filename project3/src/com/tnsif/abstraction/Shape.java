package com.tnsif.abstraction;
//program to demonstrate abstraction in java
//abstract class
public abstract class Shape {
	protected float area;
	//abstract method
	abstract void calArea();
	void show() {
		System.out.println("area of shape:"+area);
			
	}
	

}
