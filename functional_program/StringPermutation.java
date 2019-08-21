package com.bridgelabz.functional_program;
import com.bridgelabz.utility.InputScanner;
import com.bridgelabz.utility.utility;
public class StringPermutation 
{
	// generate all permutations of a String in Java
			public static void main(String[] args)
			{
				String s =InputScanner.stringInput();
			char[] str=utility.permutations(s.toCharArray(), 0);
			utility.printchar(str, s.length());
			}
}