/**
	Car class demo program
	Comp131 Trimester 1, 2012 Assignment P4
*/


public class CarDemo
{
   public static void main(String[] args)
   {
      Car fwdCar = new Car();
      Car sportsCar = new Car(2004, "Porsche", 100);
      
      // Display the current status of four wheel drive Car.
      System.out.println("Current status of the four wheel drive car:");
      System.out.println("Year model: " + fwdCar.getYearModel());
      System.out.println("Make: " + fwdCar.getMake());
      System.out.println("Speed: " + fwdCar.getSpeed());

      // Display the current status of sports Car.
      System.out.println("\nCurrent status of the sports car:");
      System.out.println("Year model: " + sportsCar.getYearModel());
      System.out.println("Make: " + sportsCar.getMake());
      System.out.println("Speed: " + sportsCar.getSpeed());
      
      // Accelerate the four wheel drive car five times.
      System.out.println("\nAccelerating four wheel drive car...");
      fwdCar.accelerate();
      fwdCar.accelerate();
      fwdCar.accelerate();
      fwdCar.accelerate();
      fwdCar.accelerate();
      
      // Decelerate the four wheel drive car two times.
      System.out.println("\nDecelerating four wheel drive car...");
      fwdCar.brake();
      fwdCar.brake();

      // Decelerate the sports car three times.
      System.out.println("\nDecelerating sports car...");
      sportsCar.brake();
      sportsCar.brake();
      sportsCar.brake();
      
      // Accelerate the sports car two times.
      System.out.println("\nAccelerating sports car...");
      sportsCar.accelerate();
      sportsCar.accelerate();

      // Display the speed of the sports car.
      System.out.println("\nNow the speed of the sports car is " + sportsCar.getSpeed());
      
      // Display the speed of the four wheel drive car.
      System.out.println("\nNow the speed of the four wheel drive car is " + fwdCar.getSpeed());
   }
}