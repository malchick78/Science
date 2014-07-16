import java.util.Scanner;

//Notes: We do not assume Hexagons are regular hexagons.

public class Hexagon extends Polygon {
  public Hexagon() {
    setSides(6);
  }

  public String toString() {
    return super.toString() + " -> Hexagon";
  }
}