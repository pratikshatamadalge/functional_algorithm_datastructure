package com.bridgelabz.functional_program;
import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int power=1;
		System.out.println("Enter a max number for power of two\n It should be in the range 0-31");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			power=power*2;
		}
		
		System.out.println(power);
		s.close();
	}
}
