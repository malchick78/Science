import java.util.*;

public class MyListDemo
{
    public static void main(String[] args)
    {

        ArrayList<Integer> m = new ArrayList<Integer>();
        m.add(89);
        m.add(95);
        m.add(97);
        m.add(90);
        m.add(93);
        m.add(89);

        // Display the the size of the array list.                                                                                                                                                                                                                            
        System.out.println("Mark has passed " + m.size() +" subjects. ");

        // Display Mark's grades.                                                                                                                                                                                                                                             
        for (int index = 0; index < m.size(); index++)
            System.out.print(m.get(index) + " ");
        System.out.println();

        // Create a MyList object and construct it with the ArrayList as                                                                                                                                                                                                      
        // an argument.                                                                                                                                                                                                                                                       
        MyList<Integer> mine = new MyList<Integer>(m);

        // Output the contents of MyList                                                                                                                                                                                                                                      
        System.out.print(mine.toString());
    }
}