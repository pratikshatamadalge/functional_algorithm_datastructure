package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
public class MonthlyPayment {
	public static void main(String[]args)
	{	
		float P;
		double Y,R;
		
		System.out.println("Enter the principal amount of loan");
		P=InputScanner.intInput();
		
		System.out.println("Enter the rate of interest");
		R=InputScanner.doubleInput();
		
		System.out.println("Enter for how much Year");
		Y=InputScanner.doubleInput();
		
		double payment=utility.monthlyPayment(P,R,Y);
		
		System.out.println("Payment required is "+payment);
	}

}
