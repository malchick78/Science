/**
  
   The Vehicle class holds data about certain attributes of a 
   vehicle. The program creates objects to be stored in an 
   array structure and provides set and get methods for each
   of its fields. A separate compareTo method is also provided
   for each field, as well as a toString method.

*/
public class Vehicle
{
    private String type;
    private String make;
    private String colour;

    /**
       Constructor to assign values to an object's attributes.
    */

    public Vehicle(String tp, String mk, String cl)
    {
	type = tp;
	make = mk;
	colour = cl;
    }

    /**
       The setType method stores a value in the type field.
       @param tp The value to store in type.
    */
    
    public void setType(String tp)
    {
	type = tp;
    }

    /**
       The setMake method stores a value in the make field.
       @param mk The value to store in make.
    */
   
    public void setMake(String mk)
    {
	make = mk;
    }

    /**
       The setColour method stores a value in the colour field.
       @param cl The value to store in colour.
    */

    public void setColour(String cl)
    {
	colour = cl;
    }

    /**
       The getType method returns a Vehicle object's type.
       @return type The value in the type field.
    */

    public String getType()
    {
	return type;
    }

    /**
       The getMake method returns a Vehicle object's make.
       @return make The value in the make field.
    */

    public String getMake()
    {
	return make;
    }

    /** 
	The getColour method returns a Vehicle object's colour.
	@return colour The value in the colour field.
    */

    public String getColour()
    {
	return colour;
    }
	
    /**
       The typeCompareTo method allows a Vehicle object to be
       compared to another Vehicle object for order, according
       to type.
    */
	
    public int typeCompareTo(Vehicle vh)
    { 
	if (type.compareTo(vh.type) < 0)
	    return -1;
	else if (type.compareTo(vh.type) > 0)
	    return 1;
	else
	    return 0;
    }
    
    /**
       The makeCompareTo method allows a Vehicle object to be
       compared to another Vehicle object for order, according
       to make.
    */

    public int makeCompareTo(Vehicle vh)
    { 
	if (make.compareTo(vh.make) < 0)
	    return -1;
	else if (make.compareTo(vh.make) > 0)
	    return 1;
	else
	    return 0;
    }
	
    /**
       The colourCompareTo method allows a Vehicle object to be
       compared to another Vehicle object for order, according
       to colour.
    */

    public int colourCompareTo(Vehicle vh)
    { 
	if (colour.compareTo(vh.colour) < 0)
	    return -1;
	else if (colour.compareTo(vh.colour) > 0)
	    return 1;
	else
	    return 0;
    }

    /**
       The toString method returns a string that represents
       information about the object.
    */

    public String toString()
    {
	String str = "The type of vehicle is a " + type + 
	             " and the make is " + make + 
	             " and the colour is " + colour; 
	return str;
    }
}
