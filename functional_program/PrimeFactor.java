package com.bridgelabz.functional_program;
import com.bridgelabz.utility.InputScanner;
public class PrimeFactor {

	public static void main(String[]args)
	{
		int num,j;
		System.out.println("enter the number");
		num=InputScanner.intInput();

		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				for(j=2;j<i;j++)
				{
					if(i%j==0)
						break;
				}
				if(j==i)
					System.out.println("prime factor="+j);
			}
		}
	}
}
