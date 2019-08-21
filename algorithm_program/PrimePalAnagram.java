package com.bridgelabz.algorithm_program;
import java.util.ArrayList;
import com.bridgelabz.utility.InputScanner;
public class PrimePalAnagram {

	public ArrayList<Integer> PrimeNo(int n)      //prime no 
	{
		int i, number; 
		boolean flag=false;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(number = 1; number <= n; number++)
		{
			flag = false;
			for (i = 2; i <= number/2; i++)
			{
				if(number % i == 0)
				{
					flag=true;

					break;
				}
			}
			if(flag == false && number >1 )
			{
				list.add(number);
			}  
		}
		return list;
	}


	public static int isPalin(int num) //reverse
	{
		int test = 0;
		while (num != 0)
		{
			int rem = num % 10;
			test = test * 10 + rem;
			num = num / 10;
		}
		return test;
	}



	public static boolean isPalindrome(int num)
	{
		return num == isPalin(num);
	}

	public static void main(String[] args) {



		PrimePalAnagram p=new PrimePalAnagram();
		ArrayList<Integer> list = new ArrayList<Integer>();    //List of prime numbers
		ArrayList<Integer> list1 = new ArrayList<Integer>();   //List of prime-palindrome numbers
		ArrayList<Integer> list2 = new ArrayList<Integer>();   //List of prime-palindrome-anagram numbers


		int n=0;
		System.out.print("Enter n : ");
		n=InputScanner.intInput();

		list=p.PrimeNo(n);

		System.out.print("Prime numbers are : ");
		for(int i:list)
		{
			System.out.print(i+" ");
		}


		System.out.print("\nList of prime-palindrome numbers : ");

		for(int i:list)
		{
			if (isPalindrome(i))
			{
				System.out.print(i + " ");
				list1.add(i);
			}   

		}

		for(int i:list)            //anagram numbers
		{
			for(int j:list1)
			{
				if(i==j)
				{
					list2.add(i);
				}
			}
		}

		System.out.print("\nPrime-Palindrome-anagram numbers are : ");
		for(int i:list2)
		{
			System.out.print(i+" ");
		}
	}
}