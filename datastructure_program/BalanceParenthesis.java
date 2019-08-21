package com.bridgelabz.datastructure_program;
import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {


	public void stack_push(Stack<Character> stack,Character char1)  //push into the stack
	{ 

		stack.push(char1); 

	} 


	public void stack_pop(Stack<Character> stack)     //pop top of stack
	{ 
		if(!stack.isEmpty())
			stack.pop(); 
		else
			System.out.println("Stack Empty..");

	} 

	public void printStack(Stack<Character> stack)      //Print stack elements
	{
		stack.forEach(k->                        
		{    
			System.out.print(k+" ");
		});
	}

	public static void main (String[] args) 
	{ 
		Stack<Character> stack = new Stack<Character>();

		BalanceParenthesis bp=new BalanceParenthesis();

		int lcount=0,rcount=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the expression : ");
		String ch=sc.next();


		for(int i=0;i<ch.length();i++)
		{
			Character char1=ch.charAt(i);
			
			if(char1=='(')
				bp.stack_push(stack,char1);
			
			if(char1==')')
				bp.stack_push(stack,char1);

		}

		//Print Stack element

		System.out.println("Stack elements are : ");
		bp.printStack(stack);
		
		
		while(!stack.isEmpty()) //Compare parenthesis
		{
			if((Character) stack.pop()=='(')
				lcount+=1;
			else
				rcount+=1;

		}


		if(lcount==rcount)
		{
			System.out.println("\nBalanced Parenthesis");
		}       
		else
		{
			System.out.println("\nUnbalanced Parenthesis");
		}
		
		sc.close();
	}
}