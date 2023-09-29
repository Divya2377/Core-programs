package com.tnsif.constructorprj;

public class Student  extends Citizen{
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int rollno;
	private String collegeName;
	
	public Student(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}

	public Student(String name, long aadhar, String address, long phno) {
		super(name, aadhar, address, phno);
		// TODO Auto-generated constructor stub
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	//@Override
	//public String toString() {
	//	return "Student [rollno=" + rollno + ", collegeName=" + collegeName + "]";
	//}
	
	
}
