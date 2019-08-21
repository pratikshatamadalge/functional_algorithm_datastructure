package com.bridgelabz.utility;
import com.bridgelabz.datastructure_program.UnsortedList;
public class DataStructureUtil {
	Node head;
	public static class Node
	{
		String data;
		Node next;

		Node(String str)
		{
			data=str;
			next=null;
		}
	}
	//if given string present then delete operation
	public static UnsortedList delete_node(UnsortedList list, String str2) {
		// TODO Auto-generated method stub
		Node curr_node=list.head;
		Node prev=null;
		if(curr_node.next!=null && curr_node.data.compareTo(str2)==0)
		{
			list.head=curr_node.next;
			System.out.println("key found and deleted");
			return list;
		}
		while(curr_node.next!=null && curr_node.data.compareTo(str2)!=0)
		{
			prev=curr_node;
			curr_node=curr_node.next;
		}
		if(curr_node!=null && curr_node.data.compareTo(str2)==0)
		{
			prev.next=curr_node.next;	
		}
		return list;
	}

	//if string is not there then add operation
	public static UnsortedList add_node(UnsortedList list,String str)
	{
		// TODO Auto-generated method stub
		Node new_node=new Node(str);
		new_node.next=null;

		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}

	public static Boolean listSearch(UnsortedList list, String str2) {
		// TODO Auto-generated method stub
		Node curr_node=list.head;
		Boolean flag=false;
		while(curr_node.next!=null)
		{
			if(curr_node.data.compareTo(str2)==0)
			{
				flag=true;
				break;
			}
			curr_node=curr_node.next;
		}
		return flag;

	}

	public static void printList(UnsortedList list) {
		// TODO Auto-generated method stub
		Node curr_node=list.head;
		System.out.println("linked list is");
		while(curr_node.next!=null)
		{
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
		System.out.println();
	}
}