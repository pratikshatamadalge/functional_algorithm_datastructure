package com.bridgelabz.algorithm_program;
import java.util.Scanner;
import com.bridgelabz.utility.*;
public class MonthlyPayment {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		
		float P;
		double Y,R;
		
		System.out.println("Enter the principal amount of loan");
		P=s.nextFloat();
		
		System.out.println("Enter the rate of interest");
		R=s.nextDouble();
		
		System.out.println("Enter for how much Year");
		Y=s.nextDouble();
		
		double payment=utility.monthlyPayment(P,R,Y);
		
		System.out.println("Payment required is "+payment);
		s.close();
	}

}
