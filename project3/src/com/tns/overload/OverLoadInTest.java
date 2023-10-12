package com.tns.overload;

public class OverLoadInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading ob=new OverLoading();
		int s=ob.Volume(2);
		System.out.println("The volume of cube is"+s);
		float r=ob.Volume(2.3f,4.2f,6.3f);
		System.out.println("The volume of cube is"+r);
		double v=ob.Volume(2.3d);
		System.out.println("The volume of cube is"+v);

	}

}
