package com.bridgelabz.datastructure_program;
import com.bridgelabz.utility.*;
public class PrimeNumberInRange {

	public static void main(String[]args)
	{
		int num;
		
int j=1;
		for(int i=100;i<=1000;i=i*j)
		{
			num=utility.primeNo(i);
			if(num!=-1)
			{
				System.out.print(num+" ");
			}
		}
	}
}