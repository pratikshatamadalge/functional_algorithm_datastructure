package com.bridgelabz.functional_program;

import com.bridgelabz.utility.InputScanner;

public class LeapYear {
	public static void main(String[]args)
	{
		int year;
		System.out.println("Enter the value of year");
		year=InputScanner.intInput();

		if(year%400==0||year%4==0)
		{
			System.out.println("year is a leap year");
		}
		else if(year%100==0)
		{
			System.out.println("year is not a leap year");
		}
		else
		{
			System.out.println("year is not a leap year");
		}
	}
}

