package com.bridgelabz.utility;
import java.util.Arrays;
public class utility {

	/* ***************************************
	 * *******String Anagram******************/
	public static void stringAnagram(char[] s1,char[] s2)
	{
		int l1=s1.length;
		int l2=s2.length;

		boolean flag=false;
		if(l1==l2)
		{
			Arrays.sort(s1);
			Arrays.sort(s2);
			int i;
			for(i=0;i<l1;i++)
			{
				if(s1[i]==s2[i])
				{
					flag=true;
				}
			}
		}
		else
		{
			flag=false;
		}

		if(flag==true)
		{
			System.out.println("strings are anagram");
		}
		else
		{
			System.out.println("strings are not anagram");
		}
	}

	/* *************************************************
	 * ******Prime number between 1 to 100**************/

	public static int primeNo(int n)
	{
		int number,i;
		number=n;

		for(i=2;i<=number;i++)
		{
			if(number%i==0)
			{
				break;
			}
		}
		if(i==number)
			return number;
		else
			return -1;

	}


	/* **********************************************
	 * ******************Palindrome*****************/

	public static void palindromeNum(int number)
	{
		int sum;
		int num=number;
		for(sum=0;num!=0;num=num/10)
		{
			int rem=num%10;
			sum=rem+sum*10;
		}
		if(sum==number)
		{
			System.out.println(number+" ");
		}
	}


	/* **********************************************
	 * ******Binary search for the Integer*********/

	public static int binarySearchInt(int arr[],int first,int last,int key)
	{

		int mid=(first+last)/2;
		while(first<last)
		{
			if(key>arr[mid])
			{
				first=mid+1;
				return binarySearchInt(arr,first,last,key);

			}
			else if(key==arr[mid])
			{
				mid=mid +1;
				System.out.println("key is present at index"+mid);
				return mid;
			}
			else
			{
				last=mid-1;
				return binarySearchInt(arr, first, last, key);
			}

		}
		if(first>=last)
		{
			return -1;
		}
		return mid;
	}



	/* ***************************************
	 * ********Binary search for a string ***/

	public static int binarySearchForString(char str[],int first,int last,char ch)  
	{
		int mid=(first+last-1)/2;

		while(first<last)
		{
			if(ch>str[mid])
			{
				first=mid+1;
				return binarySearchForString(str, first, last, ch);
			}
			else if(ch==str[mid])
			{
				mid=mid+1;
				System.out.println("character found at index"+mid);
				return mid;
			}
			else
			{
				last=mid-1;
				return binarySearchForString(str, first, last, ch);
			}
		}
		if(first>=last)
		{
			return -1;
		}
		return mid;
	}

	/* ***************************************
	 * ********Binary search for a word ***/

	public static int binarySearchForWord(String str[],int first,int last,String ch)  
	{
		int mid=(first+last-1)/2;

		while(first<last)
		{
			if(ch.compareTo(str[mid])<0)
			{
				first=mid+1;
				return binarySearchForWord(str, first, last, ch);
			}
			else if(ch.compareTo(str[mid])==0)
			{
				mid=mid+1;
				System.out.println("character found at index"+mid);
				return mid;
			}
			else
			{
				last=mid-1;
				return binarySearchForWord(str, first, last, ch);
			}
		}
		if(first>last)
		{
			return -1;
		}
		return mid;
	}
	/* *************************************************
	 ********** Bubble sort for the Integer********/

	public static int[] bubbleSortFor(int arr[],int l)
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;
	}

	/* ****************************************************
	 * ****Bubble sort for the String********************/

	public static char[] bubbleSortForString(char[] str,int l)
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(str[j]<str[i])
				{
					char temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
		return str;
	}

	/* ****************************************************
	 * ****Bubble sort for the String********************/

	public static String[] bubbleSortForWord(String[] str,int l)
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(str[j].compareTo(str[i])>0)
				{
					String temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
		return str;
	}



	/* ******************************************************
	 **************** Insertion sort for integer**********/

	public static int[] insertionSortForInteger(int arr[])
	{
		int l=arr.length;
		for(int i=1;i<l;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}

	/* ********************************************************
	 * *****Insertion sort for String *************************/

	public static char[] insertionSortForString(char[] str)
	{
		int l=str.length;

		for(int i=1;i<l;i++)
		{
			char key=str[i];
			int j=i-1;
			while(j>=0 && str[j]>key)
			{
				str[j+1]=str[j];
				j=j-1;
			}
			str[j+1]=key;
		}
		return str;
	}
	/* ********************************************************
	 * *****Insertion sort for word************************ */

	public static String[] insertionSortForWord(String[] str)
	{
		int l=str.length;

		for(int i=1;i<l;i++)
		{
			String key=str[i];
			int j=i-1;
			while(j>=0 && ((str[j].compareTo(key)>0)))
			{
				str[j+1]=str[j];
				j=j-1;

			}
			str[j+1]=key;
		}
		return str;
	}
	/* *******************************************************
	 * ***********Merge sort for an integer*****************/

	public static void mergeSortForInteger(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;

		int L[]=new int[n1];
		int R[]=new int[n2];

		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}

		for(int j=0;j<n2;j++)
		{
			R[j]=arr[m+1+j];
		}

		int i=0;
		int j=0;
		int k=l;

		while(i<n1 && j<n2)
		{
			if(L[i]<=R[i])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}

		//Remaining elements
		while(i<n1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
	}

	/* ******************************************
	 ****** Merge sort for the String***********/

	public static void mergeSortForString(char[] str,int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;

		char L[]=new char[n1];
		char R[]=new char[n2];

		for(int i=0;i<n1;i++)
		{
			L[i]=str[l+i];
		}

		for(int j=0;j<n2;j++)
		{
			R[j]=str[m+1+j];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[i])
			{
				str[k]=L[i];
				i++;
			}
			else
			{
				str[k]=R[j];
				j++;
			}
			k++;
		}

		while(i<n1)
		{
			str[k]=L[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			str[k]=R[j];
			j++;
			k++;
		}
	}


	/* ******************************************
	 ****** Merge sort for the String***********/

	public static String[] mergeSortForWord(String[] str,int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;

		String L[]=new String[n1];
		String R[]=new String[n2];

		for(int i=0;i<n1;i++)
		{
			L[i]=str[l+i];
		}

		for(int j=0;j<n2;j++)
		{
			R[j]=str[m+j+1];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if((L[i].compareTo(R[i])>0) || (L[i].compareTo(R[i])==0))
			{
				str[k]=L[i];
				i++;
			}
			else
			{
				str[k]=R[j];
				j++;
			}
			k++;
		}

		while(i<n1)
		{
			str[k]=L[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			str[k]=R[j];
			j++;
			k++;
		}
		return str;
	}

	/* ********************************************
	 * ***********print integer Array*********/

	public static int[] printArray(int[] arr1, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		return arr1;
	}

	/* ********************************************
	 * ***********print character Array******** */

	public static char[] printchar(char[] str1, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++)
		{
			System.out.print(str1[i]);
		}
		System.out.println();
		return str1;
	}

	/* *********************************************
	 ***********print string Array********* */

	public static String[] printString(String[] str1, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++)
		{
			System.out.print(str1[i]);
		}
		System.out.println();
		return str1;
	}


	/*	***********************************************
			Vending Machine to find minimum number of notes	
	 ***********************************************/


	public static void CalcNotes(int arr[],int change) 
	{ 
		int n_notes,min_notes=0;
		while(change>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				n_notes = change / arr[i];
				change = change % arr[i];
				min_notes += n_notes;
				System.out.println("No of "+arr[i]+" rupees notes : "+n_notes);
			}
		}
		System.out.println("\n\nMinimum number of notes : "+min_notes);
	}


	/*	***********************************************
			Temperature (Celsius to Fahrenheit)	
	 *********************************************** */


	public static double CalcFTemp(double temp) 
	{ 
		return (temp * 9/5) + 32;

	}




	/*	***********************************************
			Temperature (Fahrenheit to Celsius)	
	 ************************************************ */

	public static double CalcCTemp(double temp) 
	{ 

		double ctemp;
		ctemp=(temp - 32) * 5/9 ;
		return ctemp;
	}


	/*	***********************************************
						Day Of Week
	 *********************************************** */

	public static int dayofweek(int d, int m, int y) 
	{  
		int y0,d0,m0,x;
		y0 = y - (14 - m ) / 12;
		x = y0 + y0 /4 - y0 /100 + y0 /400;
		m0 = m + 12 * ((14 - m ) / 12) - 2;
		d0 = ( d + x + 31 * m0 / 12) % 7;

		return d0;
	} 


	/*		***********************************************
			Calculate Sqrt using Newton Method
	 ************************************************** */
	public static double CalSqrtNewton(double c)
	{
		double epsilon = 1e-15;    // relative error tolerance
		double t = c;              // estimate of the square root of c

		// repeatedly apply Newton update step until desired precision is achieved
		while (Math.abs(t - c/t) > epsilon*t) {
			t = (c/t + t) / 2.0;
		}
		// print out the estimate of the square root of c
		System.out.println(t);
		return t;
	}

	/* *******************************************
	 ************* Monthly payment****************/
	public static double monthlyPayment(float P, double R, double Y) {
		// TODO Auto-generated method stub


		double n=12*Y;

		double r=R/(12*100);

		double payment=(P*r)/(1-Math.pow((1+r),(-n)));

		return payment;
	}

	/* ***************************************
	 * *********Wind chill********************/
	public static double windchill(double v, double t) {
		// TODO Auto-generated method stub
		double w;
		w=35.75+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return w;
	}

	/* ***************************************
	 * *********printing 2D array integer********************/
	public static int[][] print_2DArray(int[][] array,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("\n");
		}
		return array;
	}

	/* ***************************************
	 * *********printing 2D array double********************/
	public static double[][] print_2DArray(double[][] array,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("\n");
		}
		return array;
	}

	/* ***************************************
	 * *********printing 2D array boolean********************/
	public static boolean[][] print_2DArray(boolean[][] array,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println("\n");
		}
		return array;
	}

	/* ***************************************
	 * *********input 2D array integer********************/
	public static int[][] input_2DArray(int[][] array,int row,int coulumn)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coulumn;j++)
			{
				array[i][j]=InputScanner.intInput();
			}
		}
		return array;
	}
	/* ***************************************
	 * *********input 2D array integer********************/
	public static double[][] input_2DArray(double[][] array,int row,int coulumn)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coulumn;j++)
			{
				array[i][j]=InputScanner.doubleInput();
			}
		}
		return array;
	}
	/* ***************************************
	 * *********input 2D array integer********************/
	public static boolean[][] input_2DArray(boolean[][] array,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				array[i][j]=InputScanner.booleanInput();
			}
		}
		return array;
	}

	/* ***************************************
	 * *********system time start********************/

	public static double Start()
	{
		double start=System.currentTimeMillis();
		return start;
	}
	/* ***************************************
	 * *********system time stop********************/
	public static double Stop()
	{
		double stop=System.currentTimeMillis();
		return stop;
	}
	/* ***************************************
	 * *********system elapsed_time ********************/
	public static double Elapsed_time(double start,double stop)
	{
		double Et=stop-start;
		System.out.println("Elapsed time="+Et);	
		return Et;
	}


	// Recursive function to generate all permutations of a String
	public static char[] permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) 
		{
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
		return ch;
	}	
	// Utility function to swap two characters in a character array
	public static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}