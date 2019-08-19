package com.bridgelabz.functional_program;
import java.util.Scanner;
public class Stopwatch {
	long Start=0;
	long Stop=0;
	long Et=0;
	long Now=0;
	public static void main(String[]args)
	{
		Stopwatch sw=new Stopwatch();
		int ch;
		int n;

		Scanner s=new Scanner(System.in);

		do
		{
			System.out.println("1.Start\n 2.Stop\n Enter your choice");
			ch=s.nextInt();

			switch(ch)
			{
			case 1:
				sw.Start();
				break;

			case 2:
				sw.Stop();
				break;
			}
			System.out.println("Do you want to continue? 1 for yes");
			n=s.nextInt();
		}while(n==1);
		sw.Stop();
		sw.Elapsed_time();
		s.close();
	}

	public void Start()
	{
		Start=System.currentTimeMillis();
	}

	public void Stop()
	{
		Stop=System.currentTimeMillis();
	}

	public void Elapsed_time()
	{
		Et=Stop-Start;
		System.out.println("Elapsed time="+Et);	
	}

}