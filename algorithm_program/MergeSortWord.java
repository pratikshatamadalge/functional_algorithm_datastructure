package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
public class MergeSortWord {

		public static void main(String[]args)
		{
			String[] str= {"mnop","xyz","pratiksha","shreya","sdf","abcd"};
			int l=0;
			int r=str.length-1;
			int m=l+(r-l)/2;
			String[] str1=utility.mergeSortForWord(str, l, m, r);
			System.out.println("after sorting string is");
			for(int i=0;i<str.length;i++)
			{
				System.out.print(str1[i]+" ");
			}
			System.out.println();
		}

	}
