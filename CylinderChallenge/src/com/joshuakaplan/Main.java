package com.joshuakaplan;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(2);
		Cylinder cylinder = new Cylinder(2, 10);
		
		System.out.println(circle.getArea());
		System.out.println(cylinder.getVolume());

	}

}
