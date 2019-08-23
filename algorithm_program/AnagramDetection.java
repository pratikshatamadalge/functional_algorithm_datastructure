package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.InputScanner;
import com.bridgelabz.utility.utility;
public class AnagramDetection {
	public static void main(String[]args)
	{
		System.out.println("Enter the first string");
		char str1[]=InputScanner.stringInput().toCharArray();
		
		System.out.println("Enter the Second string");
		char str2[]=InputScanner.stringInput().toCharArray();
		
		utility.stringAnagram(str1, str2);
	}

}
