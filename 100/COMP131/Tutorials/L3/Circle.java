/**********************************************
 * This is an example of how to use methods
 * and constants of the Math class to compute
 * the area of a circle
 *
 * ********************************************/
import java.util.Scanner;

public class Circle
{
  public static void main(String[] args)
  {
    System.out.println("Enter the radius of your circle: ");
    Scanner input = new Scanner(System.in);
    double radius = input.nextDouble();

    double area = Math.PI * Math.pow(radius,2);

    System.out.printf("Area of a circle with radius %f is %f\n\n",
                       radius, area);
  }//main
}//Circle

