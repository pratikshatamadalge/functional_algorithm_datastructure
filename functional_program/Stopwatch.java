package com.bridgelabz.functional_program;
import com.bridgelabz.utility.InputScanner;
import com.bridgelabz.utility.utility;

public class Stopwatch {
	long Start=0;
	long Stop=0;
	long Et=0;
	long Now=0;
	public static void main(String[]args)
	{
		int ch;
		int n;
		double start = 0;
		double stop = 0;
		do
		{
			System.out.println("1.Start\n 2.Stop\n Enter your choice");
			ch=InputScanner.intInput();

			switch(ch)
			{
			case 1:
			start=utility.Start();
				break;

			case 2:
			stop=utility.Stop();
				break;
			}
			System.out.println("Do you want to continue? 1 for yes");
			n=InputScanner.intInput();
		}while(n==1);
		utility.Stop();
		
		utility.Elapsed_time(start,stop);
	}
}