package com.bridgelabz.functional_program;
import com.bridgelabz.utility.*;
public class WindChill {

	public static void main(String[]args)
	{
		double v;
		double t;
		System.out.println("Enter the velocity of wind in the range 3 to 120");
		
		v=InputScanner.doubleInput();
		while(v>120 || v<3)
		{
			System.out.println("Enter the value of velocity again in the range");
			v=InputScanner.doubleInput();
		}
		
		System.out.println("Enter the temperature in farenhite");
		t=InputScanner.doubleInput();
		
		while(t>50)
		{
			System.out.println("Enter the temperature in the range only");
			t=InputScanner.doubleInput();
		}
		
		double wind=utility.windchill(v,t);
		
		System.out.println("wind chill is "+wind);
	}
}
