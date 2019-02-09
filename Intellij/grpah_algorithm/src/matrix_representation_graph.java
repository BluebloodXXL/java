import java.util.*;

public class matrix_representation_graph {

    static ArrayList<ArrayList<Integer>> al2d = new ArrayList<ArrayList<Integer>>();
    static int prow = -1;

    // prow is -1 so the nrow is greater than the prow and
    // that is how we always get to make the first condition true
    // even for the zeroth index

    public static void setrowlimit(int nrow) {

        if (nrow > prow) {

            for (int i = prow; i < nrow; i++) {
                //System.out.println("Instantiating row = " + (i + 1));
                al2d.add(new ArrayList<Integer>());

            }

            prow = nrow;

        }
    }

    public static void setrowval(int nrow, int value) {

        if (nrow > prow) {

            for (int i = prow; i < nrow; i++) {
                //System.out.println("Instantiating row = " + (i + 1));
                al2d.add(new ArrayList<Integer>());
            }

            prow = nrow;
            al2d.get(nrow).add(value);

        } else {

            al2d.get(nrow).add(value);

        }
    }

    public static void setrowval(int nrow, int inner_index, int value) {

        if (inner_index <= al2d.get(nrow).size()) {

            al2d.get(nrow).set(inner_index, value);

        } else if (nrow > prow) {

            for (int i = prow; i < nrow; i++) {
                //System.out.println("Instantiating row = " + (i + 1));
                al2d.add(new ArrayList<Integer>());

            }

            prow = nrow;
            al2d.get(nrow).add(value);

        } //else if (nrow == prow || nrow < prow) {
          else if (nrow <= prow) {

            al2d.get(nrow).add(value);

        }
    }


    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                setrowval(i, 0);
        }

        setrowval(0, 1, 1);
        setrowval(0, 3, 1);
        setrowval(1, 2, 1);
        setrowval(2, 3, 1);
        setrowval(2, 4, 1);
        setrowval(3, 4, 1);

        System.out.print("   ");

        for (int i = 0; i < 5; i++) {
            System.out.print("C" + i + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("R" + (i + 1) + " " + al2d.get(i));
        }
    }

}
