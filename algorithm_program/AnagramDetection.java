package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.utility;
import java.util.Scanner;
public class AnagramDetection {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the first string");
		char str1[]=s.next().toCharArray();
		
		System.out.println("Enter the Second string");
		char str2[]=s.next().toCharArray();
		
		utility.stringAnagram(str1, str2);
		
		s.close();
	}

}
