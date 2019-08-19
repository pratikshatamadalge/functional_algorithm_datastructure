package com.bridgelabz.functional_program;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int n;
		double num=0.0;
		System.out.println("enter the nth number for harmonic");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			num=num+(1.0/i);
		}

		System.out.println("nth harmonic number is"+num);

		s.close();
	}
}