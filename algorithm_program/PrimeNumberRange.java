package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.InputScanner;
import com.bridgelabz.utility.utility;
public class PrimeNumberRange {
	public static void main(String[] args)
	{
		System.out.println("Enter the max Range");
		int n=InputScanner.intInput();

		utility.primeNo(n);

		System.out.println("following numbers are palindrome and angram numbers");
		for(int i=0;i<n;i++)
		{
			utility.palindromeNum(i);
		}
	}
}
