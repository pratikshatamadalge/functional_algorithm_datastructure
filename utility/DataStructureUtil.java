package com.bridgelabz.utility;
import com.bridgelabz.datastructure_program.UnsortedList;
public class DataStructureUtil  
{
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
	//if string is not there then add operation
	public static Boolean add_node(UnsortedList list,String str)
	{
		Node new_node=new Node(str);
		new_node.data=str;
		new_node.next=null;

		if(list.head==null)
		{
			list.head=new_node;
			return true;
		}
		else
		{
			Node last=list.head;         //last is temporary node
			while (last.next != null) 
			{ 
				last = last.next; 
			} 
			last.next = new_node; 
		} 
		return true;
	}

	//if given string present then delete operation
	public static UnsortedList delete_node(UnsortedList list, String str2) {

		Node curr_node=list.head;
		Node prev=null;
		if(curr_node.next!=null && ((String) curr_node.data).compareTo(str2)==0)
		{
			list.head=curr_node.next;
			System.out.println("key found and deleted");
			return list;
		}
		while(curr_node.next!=null && ((String) curr_node.data).compareTo(str2)!=0)
		{
			prev=curr_node;
			curr_node=curr_node.next;
		}
		if(curr_node!=null && ((String) curr_node.data).compareTo(str2)==0)
		{
			prev.next=curr_node.next;	
		}
		return list;
	}


	//to search a particular string in a list
	public static Boolean listSearch(UnsortedList list, String str2) {

		Node curr_node=list.head;
		Boolean flag=false;
		while(curr_node.next!=null)
		{
			if(((String) curr_node.data).compareTo(str2)==0)
			{
				flag=true;
				break;
			}
			curr_node=curr_node.next;
		}
		return flag;
	}

	//to print the all node elements in the list
	public static String printList(UnsortedList ul) {
		String data="";
		Node curr_node=ul.head;
		System.out.println("linked list is");
		while(curr_node.next!=null)
		{
			data+=curr_node.data+" ";
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
		System.out.println(curr_node.data);
		return data;
	}


	//to count the number of nodes in the list
	public static int node_count(UnsortedList list)
	{
		Node curr_node=list.head;
		int count_node=0;
		while(curr_node.next!=null)
		{
			count_node++;
		}
		count_node=count_node+1;
		return count_node;
	}
	
	public static UnsortedList sortingList(UnsortedList list)
	{
		Node currNode=list.head;
		String temp;
		int counter=0;
		while(currNode!=null)
		{
			currNode=currNode.next;
			counter++;
		}

		currNode=list.head;
		for(int i=0;i<counter-1;i++)
		{
			for(int j=0;j<counter-1-i;j++)
			{
				if(currNode.data.compareTo(currNode.next.data)<0)
				{
					temp=currNode.data;
					currNode.data=currNode.next.data;
					currNode.next.data=temp;
				}
			}
		}
		currNode=currNode.next;
		return list;
	}

	public static class Dequeue<E> 
	{
		public E data;
		public Dequeue<E>next;
		public Dequeue<E>pre;

		public Dequeue()
		{
			this.next=null;
			this.pre=null;
		}

		public Dequeue(E val)
		{
			this.data=val;
			this.next=null;
			this.pre=null;
		}
	}
}