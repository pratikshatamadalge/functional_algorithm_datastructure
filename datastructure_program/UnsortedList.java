package com.bridgelabz.datastructure_program;
import com.bridgelabz.utility.DataStructureUtil;
import com.bridgelabz.utility.DataStructureUtil.Node;
import com.bridgelabz.utility.InputScanner;
import java.io.*;
public class UnsortedList {
	public Node head;
	static UnsortedList ul=new UnsortedList();
	public static void main(String[]args) throws FileNotFoundException
	{
		String str = null;
		System.out.println("create a file and write somethong and give path");

		File file=new File("/home/admin1/Desktop/java_file_io/text");
		try 
		{
			@SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(new FileReader(file));
			String st;

			while((st=br.readLine())!=null)
			{
				str=st;
				System.out.println(st);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		char[] str1=str.toCharArray();
		int cnt=0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]==' ')
			{
				cnt++;
			}
		}

		System.out.println("cnt="+cnt);

		String[] arrOfStr = str.split(" ", cnt+1);

		for (String a : arrOfStr) 
		{
			DataStructureUtil.add_node(ul, a);
			System.out.println(a);
		}

		DataStructureUtil.printList(ul);

		System.out.println("enter the string you want to search");
		String str2=InputScanner.stringInput();
		boolean flag=DataStructureUtil.listSearch(ul,str2);
		if(flag==true)
		{
			DataStructureUtil.add_node(ul, str2);
			DataStructureUtil.printList(ul);
		}
		else
		{
			DataStructureUtil.delete_node(ul, str2);
			DataStructureUtil.printList(ul);
		}
	}
}