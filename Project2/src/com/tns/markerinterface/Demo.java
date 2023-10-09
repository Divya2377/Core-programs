package com.tns.markerinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(5,"divya");
		if(s instanceof Registerable)
		{
			System.out.println("Student Registered");
		
		}
		else
		{
			System.out.println("Student not Registered");	
		}

	}

}
