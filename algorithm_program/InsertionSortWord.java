package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;;

public class InsertionSortWord {
		
		public static void main(String[]args)
		{
			String[] str= {"xyz","pratiksha","shreya","mnop","abc"};
			String[]str1= new String[str.length];
			str1=utility.insertionSortForWord(str);
			
			System.out.println("sorted string is");
			
			for(int i=0;i<str1.length;i++)
			{
				System.out.print(str1[i]+" ");
			}
		}

	}
