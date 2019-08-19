package com.bridgelabz.algorithm_program;
import java.util.Scanner;
public class BinarySwapNibblePowerOfTwo {
	public static void main(String[]args)
	{
		
		Scanner s=new Scanner(System.in);
		int num,position;
		System.out.println("Enter the number");
		num=s.nextInt();

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

		s.close();

	}

}

