package com.bridgelabz.utility;
public class LinkedList {
	Node head;
	static class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	//insertion
	public static LinkedList insert(LinkedList list,int data)
	{
		Node new_node=new Node(data);

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
	//insert at given position
	public static LinkedList insertAtPos(LinkedList list,int data,int pos)
	{
		Node new_node=new Node(data);

		Node currNode=list.head;
		Node prev=null;
		int counter=0;
		if(pos==0)
		{
			list.head=new_node;
			new_node.next=currNode;
			return list;
		}

		while(currNode!=null && counter!=pos)
		{
			prev=currNode;
			currNode=currNode.next;
			counter++;
		}

		if(currNode!=null)
		{
			prev.next=new_node;
			new_node.next=currNode;
		}

		if(currNode==null)
		{
			System.out.println("position is out of scope");
		}
		return list;
	}

	//reverse the linked list
	public static LinkedList reverseLink(LinkedList list)
	{
		Node currNode=list.head;
		Node prev=null;
		Node NEXT=null;

		while(currNode!=null)
		{
			NEXT =currNode.next;
			currNode.next=prev;
			prev=currNode;
			currNode=NEXT;
		}
		list.head=prev;
		return list;
	}

	public static LinkedList sortingList(LinkedList list)
	{
		Node currNode=list.head;
		int temp;
		int counter=0;
		while(currNode!=null)
		{
			currNode=currNode.next;
			counter++;
		}

		currNode=list.head;
		for(int i=0;i<counter-1;i++)
		{
			for(int j=1;j<counter-1-i;j++)
			{
				if(currNode.data<currNode.next.data)
				{
					temp=currNode.data;
					currNode.data=currNode.next.data;
					currNode.next.data=temp;
				}
			}
			currNode=currNode.next;
		}
		return list;
	}

	//printing the linked list
	public static void printList(LinkedList list)
	{
		Node currNode=list.head;
		System.out.println("linked list is");	
		while(currNode!=null)
		{
			System.out.println(currNode.data+" ");
			currNode=currNode.next;
		}
		//System.out.println("\n");
	}

	//Deletion by key

	public static LinkedList deleteByKey(LinkedList list,int key)
	{
		Node currNode=list.head;
		Node prev=null;

		if(currNode!=null && currNode.data==key)
		{
			list.head=currNode.next;
			System.out.println(key+"found and deleted");
			return list;
		}

		while(currNode!=null && currNode.data!=key)
		{
			prev=currNode;
			currNode=currNode.next;
		}

		if(currNode!=null && currNode.data==key)
		{
			prev.next=currNode.next;
			System.out.println(key+"found and deleted");
		}

		if(currNode==null)
		{
			System.out.println(key+"not found in the given linked list");
		}
		return list;
	}
	//deletion by the position

	public static LinkedList deleteByPosition(LinkedList list,int index)
	{
		int counter=0;

		Node currNode=list.head;
		Node prev=null;

		if(index==0 && currNode!=null)
		{
			list.head=currNode.next;
			System.out.println(index+"found and deleted");
			return list;
		}

		while(currNode!=null)
		{
			if(index==counter)
			{
				prev.next=currNode.next;
				System.out.println(index+"found and deleted");
				break;
			}
			else
				prev=currNode;
			currNode=currNode.next;
			counter++;
		}
		if(currNode==null)
		{
			System.out.println(index+"not found in the given linkedlist");
		}
		return list;
	}


	//	public static void main(String[]args)
	//	{
	//		Scanner s=new Scanner(System.in);
	//		OrderedListUtil list=new OrderedListUtil();
	//		
	//		System.out.println("enter the linkedlist data");
	//		
	//		for(int i=0;i<10;i++)
	//		{
	//			int temp=s.nextInt();
	//			list=insert(list,temp);
	//		}
	//		printList(list);
	//		
	////		list=deleteByKey(list,5);
	////		printList(list);
	////		
	////		list=deleteByPosition(list,3);
	////		printList(list);
	////		
	////		//System.out.println("-----"+list.head);
	////		//System.out.println(list.head.data);
	////		list=insertAtPos(list,4,3);
	////		printList(list);
	////		
	////		list=insertAtPos(list,11,55);
	////		printList(list);
	////		
	////		list=insertAtPos(list,11,0);
	////		printList(list);
	////		
	////		list=reverseLink(list);
	////		printList(list);
	//		
	//		list=sortingList(list);
	//		printList(list);
	//	    s.close();
	//}
}