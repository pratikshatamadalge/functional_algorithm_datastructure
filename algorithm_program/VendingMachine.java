package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
public class VendingMachine {

	public static void main(String[]args)
	{
		int[] arr= {2000,1000,500,200,100,50,10,5,2,1};
		
		System.out.println("Enter how much change you want");
		int change=InputScanner.intInput();
		
		utility.CalcNotes(arr,change);
	}
}
