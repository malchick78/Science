/*******************************************************************************
   
   Distance.java computes the distance a vehicle travelled and writes the hourly
   interval results in a file called DistanceReport.txt  
   
   Input: speed (miles per hour), time (hours)  
   Output:  distance (miles) for each hour time period
   
 ******************************************************************************/
 
 import java.util.Scanner;
 import java.io.*;
 
 public class Distance
 { 
     public static void main(String[] args) throws IOException
     {  
	 // create Scanner to obtain input from command window
	 Scanner input = new Scanner( System.in ); 
	 
	 // variable declarations
	 double speed, time;
	 int hour = 1; 
	
	 // prompt user to input a number and store in speed variable
	 System.out.print( "Enter the vehicle's speed: " );
	 speed = input.nextDouble(); 
	
	 // input validation to ensure vehicle's speed is not negative
	 while ( speed < 0 )
	 {
	     System.out.print( "Enter 0 or greater for speed: " );
	     speed = input.nextDouble(); 
	 }
	 
	 // prompt user to input a number and store in time variable
	 System.out.print( "Enter the number of hours the vehicle was in motion: " );
	 time = input.nextDouble(); 
	
	 // input validation to ensure time in motion is at least one hour
	 while ( time < 1 )
	 {
	     System.out.print( "Enter 1 or greater for hours: " );
	     time  = input.nextDouble(); 
	 }
	
	 // write the results to a newly created text file   
	 PrintWriter outputFile = new PrintWriter("DistanceReport.txt");
	 
	 // underlined table heading
	 outputFile.println( "\nHour " + "\tDistance Travelled " );
	 outputFile.println( "------------------------------------" );
	 
	 // loop to write the distance travelled for each hourly time interval
	 while ( hour <= time )
	 {
		outputFile.println( hour + "\t\t" + hour * speed );
		hour += 1; 
	 }
	 
	 outputFile.close(); 
	 System.out.print( "Report written to DistanceReport.txt." );
	 
     }
 }