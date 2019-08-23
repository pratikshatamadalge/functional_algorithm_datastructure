package com.bridgelabz.datastructure_program;
import com.bridgelabz.utility.DequeUtility;
import com.bridgelabz.utility.InputScanner;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		DequeUtility<Character> utility=new DequeUtility<Character>();
		System.out.println("Enter a String: ");
		String s=InputScanner.stringInput();

		//adding each character to the rear of the deque
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			utility.addRear(c);
		}
		int flag=0;

		while(utility.size()>1)
		{
			if(utility.removeFront()!=utility.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}