package com.bridgelabz.datastructure_program;
import com.bridgelabz.utility.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import com.bridgelabz.utility.DataStructureUtil;
import com.bridgelabz.utility.DataStructureUtil.Node;
public class OrderedList
{
	public Node head;
	static UnsortedList ul=new UnsortedList();
	static OrderedList ol=new OrderedList();
	public static void main(String[]args) throws FileNotFoundException
	{
		System.out.println("create a file and write somethong and give path");

		File file=new File("/home/admin1/Desktop/java_file_io/test1");
		try 
		{
			@SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(new FileReader(file));
			String st="";
			String str1 ="";
			while((st=br.readLine())!=null)
			{   
				str1=str1+st;

			}
			System.out.println(str1);

			String[] arrOfStr =str1.split(" ");

			for (String a : arrOfStr) 
			{
				DataStructureUtil.add_node(ul, a);
				System.out.println(a);
			}

			DataStructureUtil.printList(ul);
			DataStructureUtil.sortingList(ul);
			System.out.println("sorted list is");
			DataStructureUtil.printList(ul);
			
			System.out.println("enter the string you want to search");
			String str2=InputScanner.stringInput();
			boolean flag=DataStructureUtil.listSearch(ul,str2);

			if(flag==true)
			{
				DataStructureUtil.delete_node(ul, str2);
				DataStructureUtil.printList(ul);
				FileWriter fw=new FileWriter(file,true);
				PrintWriter pw=new PrintWriter(fw);
				fw.close();
				pw.print(str2+" ");
				pw.close();
			}
			else
			{
				DataStructureUtil.add_node(ul, str2);
				DataStructureUtil.printList(ul);
				FileWriter fw=new FileWriter(file,true);
				PrintWriter pw=new PrintWriter(fw);
				pw.print(str2+" ");
				pw.close();
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}