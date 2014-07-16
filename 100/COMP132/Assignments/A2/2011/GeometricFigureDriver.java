/*
Contributing authors:       Martin Collins
Email:                      comp132@turing.une.edu.au
Assignment:                 COMP132 2012T1 Assignment 2

Description:
A program to test the functions of a class hierarchy of gemometic figures.
 The main purpose of the program is to demonstrate how a basic class hierarchy
 is constructed. 
Notes: There are many ways to create a hierarchy of abstract objects like
 geometric figures. In this assignment we are required to implement a simple
 hierarchy not based on any particular mathematical rigour. The main ideas
 are to be able to correctly understand the concept of the 'extends' keyword
 and to observe the nature of the way the toString method can be called to
 iterate back up the class hierarchy.
*/
import java.util.Scanner;
import java.util.ArrayList;

public class GeometricFigureDriver {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    ArrayList<GeometricFigure> figList = new ArrayList<GeometricFigure>();

    System.out.println("This program tests a hierarchy of the GeometricFigure classes.");

    char menuChoice;
    String inputStr;
    
    do {
    
      System.out.print(                                        //Prompt for menuChoice
        "\nEnter:\n" +
        "\tC -- to add a circle\n" +
        "\tT -- to add a triangle\n" +
        "\tS -- to add a square\n" +
        "\tR -- to add a rectangle\n" +
        "\tP -- to add a polygon\n" +
        "\tH -- to add a hexagon\n" +
        "\tQ -- to quit\n");
      inputStr = s.nextLine();                                 //Assume correct input
      menuChoice = Character.toUpperCase(inputStr.charAt(0));  //Convert choice to uppercase
      
      switch (menuChoice) {                                    //Add appropriate figure to list
        case 'C':
          figList.add(new Circle(s));
          break;
        case 'H':
          figList.add(new Hexagon());
          break;
        case 'P':
          figList.add(new Polygon(s));
          break;
        case 'R':
          figList.add(new Rectangle(s));
          break;
        case 'S':
          figList.add(new Square(s));
          break;
        case 'T':
          figList.add(new Triangle());
          break;
      }

    } while (menuChoice != 'Q');
                                                               //Print the list of created figures
    System.out.println("You entered the following figures:");
    for (GeometricFigure f : figList) { System.out.println(f); }
  }

}

