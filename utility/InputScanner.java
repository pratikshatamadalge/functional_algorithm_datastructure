package com.bridgelabz.utility;
import java.util.Scanner;
import java.util.regex.Pattern;
public class InputScanner {

	static private Scanner input=new Scanner(System.in);

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
		if(Pattern.matches("/n[a-zA-Z]*$/",str))
		{
			return str;
		}
		return "invalid";
	}

	public static char charInput()
	{
		char str=input.next().charAt(0);
		String str1=str+" ";
		if(Pattern.matches("[a-zA-Z]",str1))
		{
			return str;
		}
		return 'X';
	}
	
	public static boolean booleanInput()
	{
		String str=input.nextLine();
		if(Pattern.matches("true|false",str))
		{
			return true;
		}
		return false;
	}
}