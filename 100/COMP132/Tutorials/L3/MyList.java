import java.util.*;

public class MyList<T extends Number>
{
    private ArrayList<T> marks;

    // explicit constructor                                                                                                                                                                                                                                                   
    public MyList(ArrayList<T> o)
    {
        marks = o;
    }

    // add method                                                                                                                                                                                                                                                             
    public void add(T o)
    {
        marks.add(o);
    }

    // toString method allows the structure to be                                                                                                                                                                                                                             
    // returned as a String object                                                                                                                                                                                                                                            

    public String toString()
    {
        String complete = new String();
        for (T val : marks)
            complete += val + "\n";
        return complete;
    }
}