import java.util.*;

public class arraylist_2d {

    public static void main(String[] args) {



        // Declare the 2D array list

        ArrayList<ArrayList<String>> aObject;

// Create the 2D array list
        aObject = new ArrayList<ArrayList<String>>();

// Add an element to the first dimension
        aObject.add(new ArrayList<String>());

// Place a string in position [0,0]
        aObject.get(0).add(new String("Quarks"));

// Display the string in position [0,0]
        System.out.println((aObject.get(0).get(0).toString()));


        // Declare and create the 2D array list

        ArrayList<ArrayList<Integer>> al2d= new ArrayList<ArrayList<Integer>>();

// Add an element to the first dimension [0,0]
        al2d.add(new ArrayList<Integer>());
        al2d.get(0).add(100); //[0,0]
        al2d.get(0).add(101); //[0,1]

// Add an element to the 2nd dimension [1,0]
        al2d.add(new ArrayList<Integer>());
        al2d.get(1).add(200); //[1,0]
        al2d.get(1).add(201); //[1,1]

// Display the string in position [0,0] and [0,1]
        System.out.print("Row one  :  " + al2d.get(0).get(0) + " " + al2d.get(0).get(1) + "\n");
// Display the string in position [1,0] and [1,1]
        System.out.print("Row two  :  " + al2d.get(1).get(0) + " " + al2d.get(1).get(1) + "\n");

    }
}
