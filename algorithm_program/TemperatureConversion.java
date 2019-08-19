package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[]args)
	{
		double temp,temp1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of temperature in celcious");
		temp=s.nextDouble();
		utility.CalcFTemp(temp);
		
		System.out.println("Enter the value of temperature in Farenhit");
		temp1=s.nextDouble();
		utility.CalcCTemp(temp1);
		
		s.close();
	}
}
