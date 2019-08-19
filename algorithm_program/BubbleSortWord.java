package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
public class BubbleSortWord {

		public static void main(String[]args)
		{
			String[] str= {"pratiksha","abcd","xyz","mnop","shreya"};
			int l=str.length;
			String[] str1=new String[l];
			str1=utility.bubbleSortForWord(str, l);

			System.out.println("Sorted word strings is");

			for(int i=0;i<str.length;i++)
			{
				System.out.print(str1[i]+" ");
			}
			
			System.out.println();
		}
	}