import java.util.Scanner;
 
public class Square extends Rectangle {
  public Square(Scanner s) {
    System.out.print("\nEnter the length of a Square: ");
    double x = s.nextDouble();
    setLength(x);
    setHeight(x);
    s.nextLine();
  }

  public String toString() {
    return super.toString() + " -> Square";
  }
}
