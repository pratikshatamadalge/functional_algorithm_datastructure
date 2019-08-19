package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.utility;
import java.util.Scanner;
public class PrimeNumberRange {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n;

		System.out.println("Enter the max Range");
		n=s.nextInt();

		utility.primeNo(n);

		System.out.println("following numbers are palindrome and angram numbers");
		for(int i=0;i<n;i++)
		{
			utility.palindromeNum(i);
		}


		s.close();
	}
}
