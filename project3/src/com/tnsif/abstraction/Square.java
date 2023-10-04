package com.tnsif.abstraction;

public class Square extends Shape{
	private  float side;
	public Square() {
		super();
		side=2.0f;
	}
	public Square(float side) {
		super();
		this.side = side;
    }
	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area=side;
		
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}
	
	
