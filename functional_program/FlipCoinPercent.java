package com.bridgelabz.functional_program;
import java.util.Random;
import com.bridgelabz.utility.InputScanner;
public class FlipCoinPercent {

	public static void main(String[]args)
	{
		Random rand=new Random();
		float hcount=0,tcount=0;
		System.out.println("enter the number of flips of coin");
		int n=InputScanner.intInput();

		double val[]=new double[n];

		for(int i=0;i<n;i++)
		{
			val[i]=(double)rand.nextDouble();
			System.out.println(val[i]);
		}

		for(int i=0;i<n;i++)
		{

			if(val[i]<0.5)
			{
				hcount=hcount+1;
			}
			else
			{
				tcount=tcount+1;
			}
		}

		float hper=(hcount*100)/n;
		float tper=(tcount*100)/n;
		System.out.println("percentage of hptr="+hper);
		System.out.println("percentage of tptr="+tper);
	}
}
