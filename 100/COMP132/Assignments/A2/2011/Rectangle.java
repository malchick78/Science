import java.util.Scanner;
import java.text.DecimalFormat;

public class Rectangle extends Polygon {

  private double length;
  private double height;

  public Rectangle() {
    setSides(4);
    length = 0;
    height = 0;
  }

  public Rectangle(Scanner s) {
    System.out.print("\nEnter the height and the length of a Rectangle: ");
    length = s.nextDouble();
    height = s.nextDouble();
    s.nextLine();
    setSides(4);
  }

  public void setLength(double length) { this.length = length; }
  public void setHeight(double height) { this.height = height; }

  public String toString() {
    DecimalFormat df = new DecimalFormat("0.#");
    return super.toString() + " -> Rectangle: " + "height = " + df.format(height) + ", length = " + df.format(length);
  }
}
