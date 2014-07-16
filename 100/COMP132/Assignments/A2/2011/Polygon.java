import java.util.Scanner;

public class Polygon extends GeometricFigure {

  private int sides;

  public Polygon() {
    sides = 0;
  }

  public Polygon(Scanner s) {
    System.out.print("\nEnter the number of sides in a Polygon: ");
    sides = s.nextInt();
    s.nextLine();
  }

  public void setSides(int sides) { this.sides = sides; }

  public String toString() {
    return super.toString() + " -> Polygon: " + "sides = " + sides;
  }
}
