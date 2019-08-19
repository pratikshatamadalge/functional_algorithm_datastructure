package com.bridgelabz.functional_program;

import java.util.Scanner;
public class Quadratic {
	int a,b,c;

	public void delta(int a,int b,int c)
	{
		double x1=0.0;
		double x2=0.0;
		double y;
		y=(b*b)-(4*a*c);
		x1=((-b)+Math.sqrt(y))/2*a;
		x2=((-b)-Math.sqrt(y))/2*a;

		System.out.println("x1="+x1+" "+"x2="+x2);
	}

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		Quadratic q=new Quadratic();
		//quadratic equation q.a*x*x+2*q.a*q.b+q.b*q.b;
		System.out.println("Enter the value of a");
		q.a=s.nextInt();

		System.out.println("Enter the value of b");
		q.b=s.nextInt();

		System.out.println("Enter the value of c");
		q.c=s.nextInt();

		q.delta(q.a,q.b,q.c);
		s.close();
	}
}