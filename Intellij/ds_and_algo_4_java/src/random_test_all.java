import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class random_test_all {

// Declare and create the 2D array list

  static ArrayList<ArrayList<Integer>> al2d= new ArrayList<ArrayList<Integer>>();

  public static void setrowval(int nrow, int value){
      int prow = -1;

      if (nrow > prow) {

          for (int i = prow; i < nrow; i++) {
              al2d.add(new ArrayList<Integer>());
          }

          prow = nrow;
      }

      al2d.get(nrow).add(value);
  }

  public static void main(String[] args) {

  /*    List al = new ArrayList<Integer>();

        al.add("He");
        al.add("is");
        al.add(12);
        al.add("years");
        al.add("old");
        al.add(".");

        for (int i= 0; i<al.size(); i++)
            System.out.print(al.get(i) + " ");


        //al.removeAll(al);
        System.out.printf("\n");

        int[] array = {5, 4, 3, 2, 1};

        al = Arrays.stream(array).boxed().collect(Collectors.toList());

        for (int i= 0; i<al.size(); i++)
            System.out.print(al.get(i) + " ");
            System.out.println();
  */




// Add an element to the first dimension [0,0]

      setrowval(10,1000);
      setrowval(0,100);
      setrowval(0,101);
      setrowval(1,200);
      setrowval(1,201);
      setrowval(0,102);
      setrowval(10,1001);


      System.out.print("Row one  :  " + al2d.get(0).get(0)  + " " + al2d.get(0).get(1)  + " " + al2d.get(0).get(2) + "\n");
      System.out.print("Row two  :  " + al2d.get(1).get(0)  + " " + al2d.get(1).get(1)  + "\n");
      System.out.print("Row ten  :  " + al2d.get(10).get(0) + " " + al2d.get(10).get(1) + "\n");
    }
}
