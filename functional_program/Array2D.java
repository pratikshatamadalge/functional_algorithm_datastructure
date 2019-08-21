package com.bridgelabz.functional_program;
import com.bridgelabz.utility.InputScanner;
import com.bridgelabz.utility.utility;
public class Array2D {
			public static void main(String[]args)
		{
			int r,c;

			System.out.println("Enter the number of rows");
			r=InputScanner.intInput();

			System.out.println("Enter the number of coulumns");
			c=InputScanner.intInput();


			//integer value array
			int a1[][]=new int[r][c];

			System.out.println("Enter the values of array a1");
			a1=utility.input_2DArray(a1, r, c);

			System.out.println("elements of array a1");
			a1=utility.print_2DArray(a1,r,c);

			//double value Array

			double a2[][]=new double[r][c];

			System.out.println("Enter the values of array a2");
			a2=utility.input_2DArray(a2, r, c);

			System.out.println("Elements of array a2");
			a2=utility.print_2DArray(a2,r,c);


			//Boolean value array

			boolean a3[][]=new boolean[r][c];

			System.out.println("Enter the elements of array a3");
			a3=utility.input_2DArray(a3, r, c);

			System.out.println("Elements of array a3");
			a3=utility.print_2DArray(a3,r,c);
		}
	
}
