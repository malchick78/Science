/**
	The Rainfall class stores monthly rainfall data into an array and 
	provides methods for getting total, average, highest and lowest 
	rainfall.
*/

public class Rainfall
 {
	/**
		The private field thisYear is a variable that will reference 
		an array of rainfall data
	*/
	
	private double[] thisYear; 
	
	/**
		Constructor to accept an array of rainfall figures as argument 
		and initialises the array as doubles. The constructor copies
		the elements in the array to the thisYear array.
		@param r The array to copy
	*/
	
	public Rainfall(double[] r)
	{
		// Create an array as large as r.
		thisYear = new double[r.length];
		
		// Copy the elements from r to thisYear.
		for (int index = 0; index < r.length; index ++)
			thisYear[index] = r[index];
	}
 
	/**
		The getTotalRainFall method returns the sum of the elements in
		the thisYear array.
	*/
	
	public double getTotalRainFall()
	{
		double total = 0.0; // Accumulator
		
		// Accumulate the sum of the elements in the thisYear array.
		for (int index = 0; index < thisYear.length; index ++)
			total += thisYear[index];
			
		// Return the total.
		return total;
	}
	
	/**
		The getAverageRainfFall method returns the average of the 
		elements in the thisYear array.
	*/
	
	public double getAverageRainFall()
	{		
		// Return the average.
		return getTotalRainFall() / thisYear.length;
	}
	
	/**
		The getHighestMonth method returns the month with the most amount
		of rainfall.
	*/
	
	public int getHighestMonth()
	{	
		// Declare and initialise the int variable month.
		int month = 0;
		
		// Copy the value in the first array element to the variable highest.
		double highest = thisYear[0];
		
		// Loop to determine the month when the maximum rainfall occurred.
		for (int index = 1; index < thisYear.length; index ++)
		{
			if (thisYear[index] > highest)
			{
				highest = thisYear[index];
				month = index;
			}
		}
		return month;
	}

	/**
		The getLowestMonth method returns the month with the least amount
		of rainfall.
	*/
		
	public int getLowestMonth()
	{	
		// Declare and initialise the int variable month.
		int month = 0;
		
		// Copy the value in the first array element to the variable lowest.
		double lowest = thisYear[0];
		
		// Loop to determine the month when the minimum rainfall occurred.
		for (int index = 1; index < thisYear.length; index ++)
		{
			if (thisYear[index] < lowest)
			{
				lowest = thisYear[index];
				month = index;
			}
		}
		return month;
	}
	/**
		The getRainAt method returns a specified value in the array. It 
		accepts the element number to return as its argument.
	*/
	
	public double getRainAt(int month)
	{	
		double rain = thisYear[0];
		
		for (int index = 1; index < thisYear.length; index ++)
			rain = thisYear[month];
			
		return rain;
	}
 }
	