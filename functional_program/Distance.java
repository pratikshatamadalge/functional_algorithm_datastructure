package com.bridgelabz.functional_program;

import com.bridgelabz.utility.InputScanner;

public class Distance {

	public static void main(String[]args)
	{
		int x,y;
		double Edistance;

		System.out.println("Enter the value of x");
		x=InputScanner.intInput();

		System.out.println("Enter the value of y");
		y=InputScanner.intInput();

		Edistance=Math.sqrt(x*x+y*y);

		System.out.println("Euclidean distance from (x,y) to the origine(0,0) is "+Edistance);

	}
}
