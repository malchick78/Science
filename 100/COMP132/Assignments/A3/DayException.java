/**
   DayException exceptions are thrown by the Date class 
   when an invalid day value is passed to the constructor.
*/


public class DayException extends Exception
{
    /**
       The contructor uses a generic message to prompt the 
       user to enter another number.
    */

    public DayException()
    {
	super("Invalid day. Reenter a valid day: ");
    }
}