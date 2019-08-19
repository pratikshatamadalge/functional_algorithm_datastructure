package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
import java.util.Scanner;
	public class NewtonSqareRootMethod {

		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			double c=s.nextDouble();
			//double c = Double.parseDouble(args[0]);
			utility.CalSqrtNewton(c);
		        s.close();
		}	
}
