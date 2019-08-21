package com.bridgelabz.algorithm_program;

import com.bridgelabz.utility.InputScanner;

public class BinarySwapNibblePowerOfTwo {
	public static void main(String[]args)
	{
		int num,position;
		System.out.println("Enter the number");
		num=InputScanner.intInput();

		System.out.println("Binary representation");
		for(position=8;position>=0;position--)
		{
			System.out.print(num>>position&1);
		}
		System.out.println();

		int swap=( (num & 0x0F) << 4 | (num & 0xF0) >> 4 ); 


		System.out.println("After nibble Swapping Binary representation");
		for(position=8;position>=0;position--)
		{
			System.out.print(swap>>position&1);
		}
		System.out.println();

		System.out.println("decimal number after nibble swapping");
		System.out.println(swap);

		int result=swap&swap-1;

		if(result==0)
			System.out.println("Afrer nibble swapping number is a power of 2");
		else
			System.out.println("After nibble swapping number is not a power of 2");
	}
}

