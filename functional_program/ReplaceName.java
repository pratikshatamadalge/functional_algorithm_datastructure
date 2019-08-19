package com.bridgelabz.functional_program;
import java.util.Scanner;
public class ReplaceName {
	//import java.lang.S
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int l;
		String str1;
		String str=new String("Hello <<username>>,how are you?");
		System.out.println("original string is");
		System.out.println(str);

		System.out.println("Enter the username");
		str1=s.next();
		l=str.length();
		if(l<2)
		{
			System.out.println("Enter the username with minimum 3 char");
			str=s.next();
		}


		System.out.println("After replacing <<username>> with proper name");
		System.out.println(str.replaceFirst("<<username>>",str1));
		s.close();
	}
}


