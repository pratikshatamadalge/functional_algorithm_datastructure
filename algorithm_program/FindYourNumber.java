package com.bridgelabz.algorithm_program;
import java.util.Scanner;
import com.bridgelabz.utility.*;
public class FindYourNumber {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int Nmax;
		
		System.out.println("how much maximum power of 2 number you want");
		Nmax=s.nextInt();
		
		int res=1;
		for(int i=1;i<Nmax;i++)
		{
			res=2*res;
		}
		
		System.out.println(res);
		
		int arr[]=new int[res];
		for(int i=0;i<res;i++)
		{
			arr[i]=i;
		}
		utility.printArray(arr,arr.length);
		
		System.out.println("Enter a particular number in the range between 0 to"+res);
		int number=s.nextInt();
		
		int first=arr[0];
		int last=arr[res-1];
		int mid=(first+last)/2;
		while(number!=mid && number<=last)
		{
			mid=(first+last)/2;
			if(number<mid)
				last=mid-1;
			else if(number>mid)
				first=mid;
		}
		if(number==mid)
		{
			System.out.println("The number is "+number);
		}
		else
		{
			System.out.println("the number is not in the range");
		}
	//int	index=utility.binarySearchInt(arr, first, last, number);
		
//		if(index==-1)
//		{
//			System.out.println("given number is not present in given range");
//		}
//		else
//		{
//			System.out.println("given number is present at index "+index);
//		}
		s.close();
	}

}
