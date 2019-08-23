package com.bridgelabz.utility;
import java.util.Scanner;
import java.util.regex.Pattern;
public class InputScanner {

	static final Scanner input=new Scanner(System.in);

	public static int intInput()
	{
		int number=input.nextInt();
		return number;
	}

	public static double doubleInput()
	{
		Double number=input.nextDouble();
		return number;
	}

	public static String stringInput()
	{
		String str=input.nextLine();
		return str;
	}

	public static char charInput()
	{
		char str=input.next().charAt(0);
		String str1=str+"";
		if(Pattern.matches("[a-zA-Z]",str1))
		{
			return str;
		}
		return 'X';
	}

	public static boolean booleanInput()
	{
		boolean str=input.nextBoolean();
		return str;
		
	}
}