package com.tnsif.constructorprj;
//program for single inheritance

public class Citizen {
	private String name;
	private long aadhar;
	private String address;
	private long phno;
	public Citizen() {
		super();
	}
	public Citizen(String name, long aadhar, String address, long phno) {
		super();
		this.name = name;
		this.aadhar = aadhar;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadhar=" + aadhar + ", address=" + address + ", phno=" + phno + "]";
	}
	
	
	
	
	

}
