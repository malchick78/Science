/**
	The VowelCons class counts the number of vowels and consonants in a string.
*/

public class VowelCons
{
    /** Field declarations */
	private String input;
    private int numVowels;
    private int numCons;
    
    /** Constructor to accept a String object as its argument */
	public VowelCons(String str) 
    {
		input = str;
		countVowelsAndCons();
    }

	/** Instance method to return the number of vowels in the string */
    public int getNumVowels()
    {
		return numVowels;
    }
	
	/** Instance method to return the number of consonants in the string */
	public int getNumConsonants()
    {
		return numCons;
	}
	
	/** Private method to count the number of vowels and consonants in the string */
	private void countVowelsAndCons()
	{	
		for (int i = 0; i < input.length(); i++) 
		{
	    char ch = input.charAt(i);
			
	    if ((ch == 'a') || (ch == 'A') || (ch == 'e') || (ch == 'E') || (ch == 'i')
	    || (ch == 'I') ||  (ch == 'o') || (ch == 'O') || (ch == 'u') || (ch == 'U'))
	    	numVowels++;
		
		else if (Character.isLetter(ch))
			numCons++;
		}
    }
}