package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[]args)
	{
		int[] arr= {2000,1000,500,200,100,50,10,5,2,1};
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter how much change you want");
		int change=s.nextInt();
		
		utility.CalcNotes(arr,change);
		
		s.close();
	}
}
