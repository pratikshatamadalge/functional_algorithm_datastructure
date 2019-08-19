package com.bridgelabz.functional_program;
import java.util.Scanner;
public class Array2D {
			public static void main(String[]args)
		{
			Scanner s=new Scanner(System.in);
			int r,c;

			System.out.println("Enter the number of rows");
			r=s.nextInt();

			System.out.println("Enter the number of coulumns");
			c=s.nextInt();


			//integer value array
			int a1[][]=new int[r][c];

			System.out.println("Enter the values of array a1");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a1[i][j]=s.nextInt();
				}
			}

			System.out.println("elements of array a1");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a1[i][j]+" ");
				}
				System.out.println("\n");
			}

			//double value Array

			double a2[][]=new double[r][c];

			System.out.println("Enter the values of array a2");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a2[i][j]=(Double)s.nextDouble();
				}
			}

			System.out.println("Elements of array a2");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a2[i][j]+" ");
				}
				System.out.println("\n");
			}

			//Boolean value array

			boolean a3[][]=new boolean[r][c];

			System.out.println("Enter the elements of array a3");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a3[i][j]=s.nextBoolean();
				}
			}

			System.out.println("Elements of array a3");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a3[i][j]+" ");
				}
				System.out.println("\n");
			}
			s.close();
		}
	
}
