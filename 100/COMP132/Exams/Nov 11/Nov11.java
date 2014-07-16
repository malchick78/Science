import java.util.*;
import java.io.*;

public class Nov11
{
	public static void main(String[] args) throws IOException
	{
		System.out.println(myTest(9,13));
		
		String input = "1"; 
		int months = 0;
		double totalIncome = 0;
	
		File file = new File("Test.txt");
		Scanner inputFile = new Scanner(file);
		
		if (!file.exists())
		{
			System.out.println("The file Test.txt is not found.");
			System.exit(0);
		}
		
		else {
		while (input != null)
		{
			try
			{
				totalIncome += Double.parseDouble(input);
				months++;
			}
			
			catch (NumberFormatException e)
			{
				System.out.println("Non-numeric data encountered in the file: " + e.getMessage());
			}
			
			input = inputFile.nextLine();
		} }
	}
	
	public static int myTest(int x, int y)
	{
		if (x > y)
			return 10;
		
		else 
			return (myTest(x+5, y-5) + 5);
	}
}

