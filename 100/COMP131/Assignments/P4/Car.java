/*******************************************************************************
   
   The Car class holds data about certain attributes of a car and simulates the 
   vehicle in motion.
   
 ******************************************************************************/
 
  public class Car
  { 
	/** field declarations */
	private int yearModel;
	private String make;
	private int speed;
		
	/** no-arg constructor to initialise variables */
	public Car()
	{
		yearModel = 2004;
		make = "Honda";
		speed = 0;
	}
		
	/** constructor to assign values to object's attributes */
	public Car(int yr, String mk, int sp)
	{
		yearModel = yr;
		make = mk;
		speed = sp;
	}
		
	/** method definitions */
		
	/** The setYearModel method stores a value in the yearModel field
	@param yr The value to store yearModel */
	public void setYearModel (int yr)
	{
		yearModel = yr;
	}
		
	/** The setMake method stores a value in the make field
	@param mk The value to store make */
	public void setMake (String mk)
	{
		make = mk;
	}
		
	/** The setSpeed method stores a value in the speed field
	@param sp The value to store yearModel */
	public void setSpeed (int sp)
	{
		speed = sp;
	} 
	 
	/** The getYearModel method returns a Car object's yearModel 
	@return The value in the yearModel field */
	public int getYearModel()
	{
		return yearModel;
	}
			
	/** The getMake method returns a Car object's make 
	@return The value in the make field */
	public String getMake()
	{
		return make;
	}
		
	/** The getSpeed method returns a Car object's speed 
	@return The value in the speed field */
	public int getSpeed()
	{
		return speed;
	}
		
	/** The acclerate method adds 5 to the speed field each time it is called  
	@return The final value in the speed field after last acceleration call */
	public int accelerate()
	{
		return speed += 5;
	}
		
	/** The brake method subtracts 5 to the speed field each time it is called  
	@return The final value in the speed field after last brake call */
	public int brake()
	{
		return speed -= 5;
	}
 }