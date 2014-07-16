/**
   This program extracts the month, day and year 
   components of a date and demonstrates how the
   Date class constructor throws exceptions when 
   invalid date values are entered.
*/

import java.util.*; 

public class DateDemo 
{
    public static void main(String[] args)
    {
	String dateStr, monthStr, dayStr, yearStr;
	int month, day, year;
	
	// Create Scanner object for keyboard input.
	Scanner keyboard = new Scanner(System.in);

	// User prompt to enter a date.
	System.out.println("Enter date to parse " +
			   "(MM/DD/YYYY format): ");

	// Read date entered and store in dateStr.
	dateStr = keyboard.nextLine();
	
	// Create a StringTokenizer object to tokenize 
	// dateStr with "/" as the delimiter.
	StringTokenizer strTokenizer = 
	            new StringTokenizer(dateStr, "/");
	
	// Extract the tokens.
	monthStr = strTokenizer.nextToken();
	dayStr   = strTokenizer.nextToken();
	yearStr  = strTokenizer.nextToken();

	// Convert the tokenized strings to numbers.
	month = Integer.parseInt(monthStr);
	day   = Integer.parseInt(dayStr);
	year  = Integer.parseInt(yearStr);

	// main try clause
	try 
	{
	    newDate(month, day, year);
	}
	
	// main MonthException catch clause
	catch (MonthException me) 
	{
	    System.out.println(me.getMessage());

	    try
	    {
		month = keyboard.nextInt();
	       	newDate(month, day, year);
	    }
		
	    catch (DayException de)
	    {
		System.out.println(de.getMessage());
		
		try
		{
		    day = keyboard.nextInt();
		    newDate(month, day, year);
		}
		
		catch (YearException ye)
		{
		    System.out.println(ye.getMessage());
		    
		    try
		    {
			year = keyboard.nextInt();
			newDate(month, day, year);
		    }
				
		    catch (Exception ey)
		    {
			System.out.println("Invalid year.");
		    }
		}
		
		catch (Exception ed)
		{
		    System.out.println("Invalid day.");
		}
	    }
	    
	    catch (YearException ye)
	    {
		System.out.println(ye.getMessage());
		
		try
		{
		    year = keyboard.nextInt();
		    newDate(month, day, year);
		}
		
		catch (Exception ey)
	        {
		    System.out.println("Invalid year.");
		}
	    }
	    
	    catch (Exception em)
	    {
		System.out.println("Invalid month.");
	    }	
	}
	
	// main DayException catch clause
	catch (DayException de)
	{
	       System.out.println(de.getMessage());
		
	       try
	       {
		   day = keyboard.nextInt();
		   newDate(month, day, year);
	       }
	       
	       catch (YearException ye)
	       {
		   System.out.println(ye.getMessage());
				
		   try
		   {
		       year = keyboard.nextInt();
		       newDate(month, day, year);
		   }
		   
		   catch (Exception ey)
		   {
		       System.out.println("Invalid year.");
		   }	   
	       }
	       
	       catch (Exception ed)
	       {
		   System.out.println("Invalid day.");
	       }
	}
	
	// main YearException catch clause
	catch (YearException ye)
	{
	    System.out.println(ye.getMessage());
		
	    try
	    {
		year = keyboard.nextInt();
		newDate(month, day, year);
	    }
	    
	    catch (Exception ey)
	    {
		System.out.println("Invalid year.");
	    }
	}
    }

    /**
       newDate method creates a Date object and initialises
       it with the date components entered. The method then
       displays the parsed date if all the date components 
       are valid.
       @param m Contains a month.
       @param d Contains a day.
       @param y Contains a year.
       @exception MonthException When month is invalid.
       @exception DayException When day is invalid.
       @exception YearException When year is invalid.
    */  
       
    public static void newDate(int m, int d, int y) throws
	       MonthException, DayException, YearException
    {
	Date dt = new Date(m, d, y);
	System.out.println(dt);
    }
}