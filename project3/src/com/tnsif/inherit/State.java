package com.tnsif.inherit;

public class State extends Country{
	private String statename;
	
	public State() {
		super();
	}


	public State(String countryname) {
		super(countryname);
		// TODO Auto-generated constructor stub
	}
	

	public State(String countryname, String statename) {
		super(countryname);
		this.statename = statename;
	}


	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}
	

}
