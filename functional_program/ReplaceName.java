package com.bridgelabz.functional_program;
import com.bridgelabz.utility.InputScanner;
public class ReplaceName {
	//import java.lang.S
	public static void main(String[]args)
	{
		int l;
		String str1;
		String str=new String("Hello <<username>>,how are you?");
		System.out.println("original string is");
		System.out.println(str);

		System.out.println("Enter the username");
		str1=InputScanner.stringInput();
		l=str.length();
		if(l<2)
		{
			System.out.println("Enter the username with minimum 3 char");
			str=InputScanner.stringInput();
		}

		System.out.println("After replacing <<username>> with proper name");
		System.out.println(str.replaceFirst("<<username>>",str1));
	}
}


