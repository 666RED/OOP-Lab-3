package com.hongchen.question3;

import java.util.Scanner;

public class CalculateAreaAndVolume {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Radius(cm): ");
		double radius = scanner.nextDouble();
		System.out.print("Length(cm): ");
		double length = scanner.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("Area = " + String.format("%.3f", area) + " cm2");
		System.out.println("Volume = " + String.format("%.3f", volume) + " cm2");
	}

}
