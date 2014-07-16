/** 
   The CapitalGain class demonstrates 
   the use of the LinkedQueue class.
*/

import java.util.Scanner;		// Needed for the Scanner class

class Transaction
{
	int shares;
	int price;
	
	Transaction(int shares, int price)
	{
		this.shares = shares;
		this.price = price;	
	}
	
	public String toString()
    {
       StringBuilder result = new StringBuilder();
       
       result.append(shares + " shares, $" + price + " each");
       
       return result.toString();        
    }
}

public class CapitalGain
{
    public static void main(String [] args)
    {
        // Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		String command;
		
        LinkedQueue<Transaction> myShares = new LinkedQueue<Transaction>();
        
       Boolean stop = false;
       
       do
       {
       	       System.out.print("\nEnter the next operation: ");

	  			command = keyboard.next();  			   // Read the next command
	  			
	  			if ( command.compareToIgnoreCase("buy") == 0)
	  			{
	  				ProcessBuy( keyboard,  myShares);
	  				keyboard.nextLine();			// discard the rest of the line
	  			}
	  			else if ( command.compareToIgnoreCase("sell") == 0)
	  			{
	  				ProcessSell( keyboard,  myShares);
	  				keyboard.nextLine();			// discard the rest of the line
	  			}
	  			else if ( command.compareToIgnoreCase("stop") == 0)
	  			{
	  				stop = true;
	  			}
	  			else
	  			{
	  				System.out.println("\nUnrecognised command `" + command + "'");
	  			}

       } while (!stop);
       
       System.out.print("\nState of my shares is: ");
       System.out.println( myShares );           
    }
    
    private static Boolean ProcessBuy(Scanner keyboard, LinkedQueue<Transaction> myShares)
    {
    	Transaction buy = ExtractTransaction( keyboard );
    	
    	if (buy != null)
    	{
			myShares.enqueue( buy );
			return true;  
    	}
    	return false;
    } // ProcessBuy
    
    private static Boolean ProcessSell(Scanner keyboard, LinkedQueue<Transaction> myShares)
    {
    	Transaction sell = ExtractTransaction( keyboard );
    	
    	if (sell != null)
    	{
			int gain = 0;
			do
			{
				Transaction pile = null;
				try
				{
					pile = myShares.peek();
				}
				catch (EmptyQueueException e)
				{
					System.out.println("\nYou do not have enough shares!!!");
					break;
				}
				if (pile != null)
				{
					if ( pile.shares <= sell.shares )
					{
						myShares.dequeue();
						gain += pile.shares * (sell.price - pile.price);
						sell.shares -= pile.shares;
					}
					else
					{
						pile.shares -= sell.shares;
						gain += sell.shares * (sell.price - pile.price);
						sell.shares = 0;
					}
				}
			} while(sell.shares > 0);
			
			System.out.println("Capital gain is $" + gain + ".");
			return true;  
    	}
    	return false;
    } // ProcessSell
    
    private static Transaction ExtractTransaction(Scanner keyboard)
    {
    	int shares, price;
    	String word;
    	
    	// format: "x share(s) at $y each"
		try
		{
			shares = keyboard.nextInt();  			   // Read number of shares
		}
		catch (Exception e)
		{
			System.out.println("\nNumber of shares expected!!!");
			return null;
		}
		
		do
		{
			word = keyboard.next();
		} while (word.charAt(0) != '$');
		
		try
		{
		price = new Integer(word.substring(1));
		}
		catch (NumberFormatException e)
		{
			System.out.println("\nPrice expected but got `" + word + "'!!!");
			return null;
		}
		return new Transaction(shares, price);
    } // ExtractTransaction
}

