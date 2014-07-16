/**
   MonthException exceptions are thrown by the Date class 
   when an invalid month value is passed to the constructor.
*/

public class MonthException extends Exception
{
    /**
       The contructor uses a generic message to prompt the 
       user to enter another number.
    */

    public MonthException()
    {
	super("Invalid month. Reenter a valid month: ");
    }
}