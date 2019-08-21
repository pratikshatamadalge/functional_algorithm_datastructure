package com.bridgelabz.functional_program;
import com.bridgelabz.utility.InputScanner;

import java.util.Random;
public class Gambler {
	Random rand=new Random();

	int stake;    //initial
	int goal;	  //target
	int broke;	   
	int n;

	void getdata()
	{
		System.out.println("Enter the initial value");
		stake=InputScanner.intInput();

		System.out.println("Enter the goal state gambler wants to acheive");
		goal=InputScanner.intInput();

		broke=0;

		System.out.println("Enter the value of n");
		n=InputScanner.intInput();
	}

	public static void main(String[]args)
	{
		Gambler g=new Gambler();
		int wcount=0;
		int lcount=0;
		//int n_bet=0;

		g.getdata();

		int cash=g.stake;

		for(int i=0;i<g.n;i++)
		{
			if(cash<g.goal && cash>g.broke)
			{
				//	n_bet++;
				float result=0;

				result=g.rand.nextFloat();
				//System.out.println(result);
				if(result>0.5)
				{
					cash++;
					wcount=wcount+1;
					System.out.println("wcount="+wcount);
				}
				else
				{
					cash--;
					lcount=lcount+1;
					System.out.println("lcount="+lcount);
				}

			}
			if(cash==g.goal)
				wcount++;
		}
		System.out.println("gambler win the game "+wcount+"out of bet"+g.n);

		System.out.println("gambler lose the game"+lcount+"out of bet"+g.n);
	}
}