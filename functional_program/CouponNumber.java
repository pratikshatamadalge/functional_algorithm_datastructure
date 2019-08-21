package com.bridgelabz.functional_program;
import java.util.Random;

import com.bridgelabz.utility.InputScanner;
public class CouponNumber {
	public static void main(String[]args)
	{
		Random rand=new Random();
		System.out.println("Enter the number of coupons you want" );
		int n=InputScanner.intInput();

		int num[]=new int[n];

		for(int i=0;i<n;i++)
		{
			num[i]=rand.nextInt(n);

			for(int j=0;j<i;j++)
			{
				if(num[i]==num[j])
				{
					i--;
					break;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(num[i]);
	}
}