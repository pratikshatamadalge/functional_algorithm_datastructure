package com.bridgelabz.algorithm_program;
import java.util.Scanner;
import com.bridgelabz.utility.utility;
public class BinaryInsertionMergeElapsed {


	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int ch,n,l;

		/***************Integer array input**************************/
		System.out.println("Enter the length of an array");
		l=s.nextInt();
		int arr[]=new int[l];
		int arr1[]=new int[arr.length];		
		for(int i=0;i<l;i++)
		{
			arr[i]=s.nextInt();
		}

		System.out.println("Before any operation");
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int last=arr.length;
		int first=0;

		/********************String array input********************************/

		System.out.println("Enter the String");
		char str[]=s.next().toCharArray();
		char str1[]=new char[str.length];
		long time[]=new long[7];
		System.out.println("Before any operation");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}
		System.out.println();

		int firststr=0;
		int laststr=str.length;

		System.out.println("Menu");

		System.out.println("1.Binary search method for integer");
		System.out.println("2.Binary serch method for string");
		System.out.println("3.Insertion sort method for integer");
		System.out.println("4.Insertion sort method for String");
		System.out.println("5.Bubble sort method for Integer");
		System.out.println("6.Bubble sort method for string");

		do
		{
			System.out.println("Enter the choice");
			ch=s.nextInt();

			switch(ch)
			{
			case 1:
				long starttime=System.currentTimeMillis();
				System.out.println("Enter the key you wnat to search");
				int key=s.nextInt();
				int x=utility.binarySearchInt(arr, first, last, key);
				if(x!=-1)
				{
					System.out.println("given key is present at"+x);
				}
				else
				{
					System.out.println("given key is not present in given array");
				}
				long stoptime=System.currentTimeMillis();
				long elapsedtime=stoptime-starttime;
				time[1]=elapsedtime;
				break;

			case 2:
				starttime=System.currentTimeMillis();
				System.out.println("Enter the character you wnat to search");
				char c='r';
				int y=utility.binarySearchForString(str, firststr, laststr,c );
				if(y!=-1)
				{
					System.out.println("given key is present at"+y);
				}
				else
				{
					System.out.println("given key is not present in given array");
				}
				System.out.println("given key is present at"+y);
				stoptime=System.currentTimeMillis();
				elapsedtime=stoptime-starttime;
				time[2]=elapsedtime;
				break;

			case 3:
				starttime=System.currentTimeMillis();
				arr1=utility.insertionSortForInteger(arr);
				utility.printArray(arr1, arr1.length);
				stoptime=System.currentTimeMillis();
				elapsedtime=stoptime-starttime;
				time[3]=elapsedtime;
				break;

			case 4:
				starttime=System.currentTimeMillis();
				str1=utility.insertionSortForString(str);
				utility.printchar(str1, str1.length);
				stoptime=System.currentTimeMillis();
				elapsedtime=stoptime-starttime;
				time[4]=elapsedtime;
				break;

			case 5:
				starttime=System.currentTimeMillis();
				arr1=utility.bubbleSortFor(arr, arr.length);
				utility.printArray(arr1,arr1.length);
				stoptime=System.currentTimeMillis();
				elapsedtime=stoptime-starttime;
				time[5]=elapsedtime;
				break;

			case 6:
				starttime=System.currentTimeMillis();
				str1=utility.bubbleSortForString(str, str.length);
				utility.printchar(str1, str1.length);
				stoptime=System.currentTimeMillis();
				elapsedtime=stoptime-starttime;
				time[6]=elapsedtime;
				break;

			default:
				System.out.println("Enter correct choice");
			}
			

			System.out.println("Do you want to continue press 1");
			n=s.nextInt();
		}while(n==1);	

		for(int i=1;i<=6;i++)
		{
			System.out.println("elapsedtime for the task "+i+" is "+time[i]);
		}
		s.close();
	}
}


