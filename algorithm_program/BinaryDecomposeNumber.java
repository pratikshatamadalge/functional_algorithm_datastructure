package com.bridgelabz.algorithm_program;
import java.util.Scanner;
public class BinaryDecomposeNumber {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("Enter the number ");
		num=s.nextInt();
		
		System.out.println("Binary of num is"+Integer.toBinaryString(num));
		s.close();
		
	}
}
