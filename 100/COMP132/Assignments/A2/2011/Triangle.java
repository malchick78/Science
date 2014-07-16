import java.util.Scanner;

//Notes: We do not care about the length of each side, only that there are 3 sides.
 
public class Triangle extends Polygon {
  public Triangle() {
    setSides(3);
  }

  public String toString() {
    return super.toString() + " -> Triangle";
  }
}