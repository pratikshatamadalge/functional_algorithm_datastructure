package com.bridgelabz.functional_program;
import java.util.Scanner;
import com.bridgelabz.utility.*;
public class WindChill {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		double v;
		double t;
		System.out.println("Enter the velocity of wind in the range 3 to 120");
		
		v=s.nextDouble();
		while(v>120 || v<3)
		{
			System.out.println("Enter the value of velocity again in the range");
			v=s.nextDouble();
		}
		
		System.out.println("Enter the temperature in farenhite");
		t=s.nextDouble();
		
		while(t>50)
		{
			System.out.println("Enter the temperature in the range only");
			t=s.nextDouble();
		}
		
		double wind=utility.windchill(v,t);
		
		System.out.println("wind chill is "+wind);
		s.close();
	}
}
