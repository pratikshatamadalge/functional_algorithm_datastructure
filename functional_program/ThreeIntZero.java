package com.bridgelabz.functional_program;
import java.util.Scanner;
public class ThreeIntZero {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int n;

		System.out.println("Enter the value of n");
		n=s.nextInt();

		int a[]=new int [n];

		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");



		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				for(int k=2;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
						System.out.println("\n");
					}
				}
			}
		}

		s.close();
	}
}
