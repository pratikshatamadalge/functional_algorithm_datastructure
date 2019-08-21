package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
public class TemperatureConversion {

	public static void main(String[]args)
	{
		System.out.println("Enter the value of temperature in celcious");
		double temp=InputScanner.doubleInput();
		double temp1=utility.CalcFTemp(temp);
		System.out.println("Temperature from  celsius to Farenhit: "+temp1);
	
		System.out.println("Enter the value of temperature in Farenhit");
		double temp2=InputScanner.doubleInput();
		double temp3=utility.CalcCTemp(temp2);
		System.out.println("Temperature from  Fahrenheit to  celsius: "+temp3);
	}
}
