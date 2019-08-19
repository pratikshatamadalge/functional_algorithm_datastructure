package com.bridgelabz.functional_program;
import java.util.Scanner;
public class Distance {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int x,y;
		double Edistance;
		
		System.out.println("Enter the value of x");
		x=s.nextInt();
		
		System.out.println("Enter the value of y");
		y=s.nextInt();
		
		Edistance=Math.sqrt(x*x+y*y);
		
		System.out.println("Euclidean distance from (x,y) to the origine(0,0) is "+Edistance);
		s.close();
	}
}
