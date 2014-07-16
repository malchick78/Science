import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle extends GeometricFigure {

  private double radius;

  public Circle(Scanner s) {                                   //Constructor
    System.out.print("\nEnter radius of a circle: ");          //Assumes valid input
    radius = s.nextDouble();                                   //Get data
    s.nextLine();                                              //Clean up user interface
  }

  public String toString() {
    DecimalFormat df = new DecimalFormat("0.#");               //Print to 1 or 0 decimal places
    return super.toString() + " -> Circle: " + "radius = " + df.format(radius);
  }
}
