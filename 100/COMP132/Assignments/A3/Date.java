import java.util.*;
import java.io.*;

/** 
   The Date class contains the methods to parse date strings 
   and throws exceptions when an invalid date is entered.
*/

public class Date
{
    private String month, 
	           day,   
	           year;
 
    private int mn, dy, yr;
 
    private boolean leapYear;

    /**
       The constructor accepts three int variables containing the
       month, day and year. It assigns values to the object's
       fields and calls each method to obtain the required date
       components.
       @param m Contains a month.
       @param d Contains a day.
       @param y Contains a year.
       @exception MonthException When month is invalid.
       @exception DayException When day is invalid.
       @exception YearException When year is invalid.
    */

    public Date(int m, int d, int y) throws MonthException, 
					    DayException, 
					    YearException
    {
	mn = m;
	dy = d;
	yr = y;

	isLeapYear();
	getMonth(mn);
	getDay(dy);
	getYear(yr);
    }

    /**
       isLeapYear method determines whether the year is a leap 
       year.
       @return leapYear 
    */

    private boolean isLeapYear()
    {
	if (yr % 4 == 0 && yr % 100 != 0)
	{    
	    leapYear = true;
	}
	return leapYear;
    }
    
    /**
       getMonth method matches a valid number with its
       corresponding month and returns the month as a 
       string.
       @param m Contains a month.
       @return month The month field.
       @exception MonthException When month is invalid.
    */

    public String getMonth(int mn) throws MonthException
    {
	switch(mn)
	{
	case 1:
	    month = "January";
	    break;
	case 2:
	    month = "February";
	    break;
	case 3:
	    month = "March";
	    break;
	case 4:
	    month = "April";
	    break;
	case 5: 
	    month = "May";
	    break;
	case 6:
	    month = "June";
	    break;
	case 7:
	    month = "July";
	    break;
	case 8:
	    month = "August";
	    break;
	case 9:
	    month = "September";
	    break;
	case 10:
	    month = "October";
	    break;
	case 11:
	    month = "November";
	    break;
	case 12:
	    month = "December";
	    break;
	default:
	    throw new MonthException(); // for invalid months
	}
	
	return month;
    }
    
    /** 
	getDay method sets the range of valid days for each month
	and returns the day if within the valid range. 
	@param dy Contains a day.
	@return dy The day value.
	@exception DayException When day is invalid.
    */

    public int getDay(int dy) throws DayException
    {	
	if (month == "January" || month == "March" ||
	    month == "May" || month == "July" ||
	    month == "August" || month == "October"||
	    month == "December") // for months with 31 days
	    {
		if (dy < 1 || dy > 31) throw new DayException();
	    }

	else if (month == "February")
	    {
		if (leapYear) // for February during leap years
		{
		    if (dy < 1 || dy > 29) throw new DayException();
		}
		else // for February during non-leap years
		{
		    if (dy < 1 || dy > 28) throw new DayException();
		}
	    }

	else // for months with 30 days
	    {
		if (dy < 1 || dy > 30) throw new DayException();
	    }

	return dy;
    }

    /**
       getYear method sets the range of valid years and returns 
       the year if within the valid range.
       @param yr Contains a year.
       @return yr The year value.
       @exception YearException When year is invalid.
    */

    public int getYear(int yr) throws YearException
    {
	if (yr < 1000 || yr > 3000) throw new YearException();
       
	return yr;
    }

    /**
       toString method contains information about the object.
       @return str A string containing the date components.
    */

    public String toString()
    {
	String str = "Parsed date: " + month + " " + dy + ", " + yr;
	return str;
    }
}
