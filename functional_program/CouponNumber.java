package com.bridgelabz.functional_program;
import java.util.Scanner;
import java.util.Random;
public class CouponNumber {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		Random rand=new Random();
		int n;

		System.out.println("Enter the number of coupons you want" );
		n=s.nextInt();

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
		s.close();
	}
}