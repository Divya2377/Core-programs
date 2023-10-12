package com.tns.overload;

public class OverLoading {
	public int Volume(int s) {
		return s*s*s;
	}
	public float Volume(float l,float b,float h) {
		return l*b*h;
		
	}
	public double Volume(double r) {
		return (4/3*3.14*r*r*r);
		
	}

}
