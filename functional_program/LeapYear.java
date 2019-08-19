package com.bridgelabz.functional_program;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[]args)
	{
		Scanner s =new Scanner(System.in);

		int year;
		System.out.println("Enter the value of year");
		year=s.nextInt();


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
		s.close();
	}

}

