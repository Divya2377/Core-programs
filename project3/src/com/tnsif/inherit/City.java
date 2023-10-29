package com.tnsif.inherit;

public class City extends State {
	private String cityname;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(String countryname, String statename) {
		super(countryname, statename);
		// TODO Auto-generated constructor stub
	}

	public City(String countryname) {
		super(countryname);
		// TODO Auto-generated constructor stub
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	//@Override
	//public String toString() {
		//return "City [cityname=" + cityname + "]";
	//}
	
}
