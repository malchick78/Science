/**
   YearException exceptions are thrown by the Date class 
   when an invalid year value is passed to the constructor.
*/

public class YearException extends Exception
{
    /**
       The contructor uses a generic message to prompt the 
       user to enter another number.
    */

    public YearException()
    {
	super("Invalid year. Reenter a valid year: ");
    }
}