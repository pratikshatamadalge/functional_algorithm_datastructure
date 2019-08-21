package com.bridgelabz.algorithm_program;
import com.bridgelabz.utility.*;
public class DayOfWeek 
{
	public static void main(String arg[]) 
	{ 
	    int day=0,month=0,year=0,n=0;
	    
	    do
	    {
	    System.out.println("Enter the day (dd) : ");
	    day=InputScanner.intInput();
	    }while(day> 31 || day< 1);
	    
	    do
	    {
	    System.out.println("Enter the month (mm) : ");
	    month=InputScanner.intInput();
	    }while(month> 12 || month< 1);
	    
	    
	    do
	    {
	    System.out.println("Enter the year (yyyy) : ");
	    year=InputScanner.intInput();
	    }while(year< 1000 || year> 9999);
	    
	   	n= utility.dayofweek(day,month,year);
	   	System.out.println(n); 
	   	switch(n)
	   	{
	   	case 0:System.out.println("Sunday");
	   	break;
	   	
	   	case 1:System.out.println("Monday");
	   	break;
	   	
	   	case 2:System.out.println("Tuesday");
	   	break;
	   	
	   	case 3:System.out.println("Wednesday");
	   	break;
	   	
	   	case 4:System.out.println("Thursday");
	   	break;
	   	
	   	case 5:System.out.println("Fridat");
	   	break;
	   	
	   	case 6:System.out.println("Saturday");
	   	break;
	   	}
	} 	
}