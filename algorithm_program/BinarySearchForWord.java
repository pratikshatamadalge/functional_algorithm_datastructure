package com.bridgelabz.algorithm_program;
import java.util.Scanner;
import com.bridgelabz.utility.*;
public class BinarySearchForWord {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String[] str= {"mnop","welcom","Bridgelabz","abcd","xyz"};
		String[] str1=new String[str.length];
		int r;
		str1=utility.bubbleSortForWord(str, str.length);
		System.out.println("Enter the string you want to find");
		String x=s.next();
		int first=0;
		int last=str1.length;
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str1[i]+" ");
		}

		System.out.println();
		r=utility.binarySearchForWord(str1,first,last,x);

		if(r== -1)
		{
			System.out.println("given string is not present in a list");
		}
		else
		{
			System.out.println("given string is present at index "+ r);
		}
		s.close();

	}
}