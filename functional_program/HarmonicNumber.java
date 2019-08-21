package com.bridgelabz.functional_program;

import com.bridgelabz.utility.InputScanner;

public class HarmonicNumber {

	public static void main(String[]args)
	{
		double num=0.0;
		System.out.println("enter the nth number for harmonic");
		int n=InputScanner.intInput();
		for(int i=1;i<=n;i++)
		{
			num=num+(1.0/i);
		}

		System.out.println("nth harmonic number is"+num);
	}
}