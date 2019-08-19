package com.bridgelabz.datastructure_program;
import java.util.Scanner;
import java.io.*;
public class UnorderedList {

	@SuppressWarnings("unused")
	public static void main(String[]args) throws IOException
	{
		Scanner s=new Scanner(System.in);
		File file=new File("D:\\javatest\\test.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
			
		}
		
		
	}
}
