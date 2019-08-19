package com.bridgelabz.functional_program;
import java.util.Scanner;
public class PrimeFactor {
	
		public static void main(String[]args)
		{
			Scanner s=new Scanner(System.in);
			int num,j;
			System.out.println("enter the number");
			num=s.nextInt();
			
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
			
			s.close();
		}
	}
