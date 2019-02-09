import java.util.*;

public class arraylist_2d_Auto_instantiate_method {

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

        } else if (nrow == prow || nrow < prow) {

            al2d.get(nrow).add(value);

        }
    }



    public static void main(String[] args) {

/*        //using loop inside a method
        System.out.println("Using Loop inside a Method");

        setrowval(5, 5);
        setrowval(6, 1006);
        setrowval(7, 1007);
        setrowval(8, 1008);
        setrowval(1, 1);
        setrowval(2, 2);
        setrowval(3, 3);
        setrowval(4, 4);
        setrowval(9, 1009);
        setrowval(10, 10010);
        setrowval(11, 10011);
        setrowval(0, 0);
        setrowval(5,0,50);
        setrowlimit(20);
        al2d.get(20).add(22222222);
        setrowval(20,5,2050);
        setrowval(20,1,1010);
        setrowval(20,0,0);
        setrowval(10, 10010);

        for (int i = 0; i < 20; i++) {
            al2d.get(5).add(i);
        }

      /*setrowval(0, 100);
        setrowval(0, 101);
        setrowval(1, 200);
        setrowval(1, 201);
        setrowval(0, 102);
        setrowval(10, 1001);
        System.out.print("Row one  :  " + al2d.get(0).get(0) + " " + al2d.get(0).get(1) + " " + al2d.get(0).get(2) + "\n");
        System.out.print("Row two  :  " + al2d.get(1).get(0) + " " + al2d.get(1).get(1) + "\n");
        System.out.print("Row ten  :  " + al2d.get(10).get(0) + " " + al2d.get(10).get(1) + "\n");
        System.out.print("Row ZERO  :  " + al2d.get(0).get(0) + "\n");
        System.out.print("Row one  :  " + al2d.get(1).get(0) + "\n");
        System.out.print("Row two  :  " + al2d.get(2).get(0) + "\n");
        System.out.print("Row three  :  " + al2d.get(3).get(0) + "\n");
        System.out.print("Row four  :  " + al2d.get(4).get(0) + "\n");
        System.out.print("Row five  :  " + al2d.get(5).get(0) + "\n");
        System.out.print("Row six  :  " + al2d.get(6).get(0) + "\n");
        System.out.print("Row seven  :  " + al2d.get(7).get(0) + "\n");
        System.out.print("Row eight  :  " + al2d.get(8).get(0) + "\n");
        System.out.print("Row nine  :  " + al2d.get(9).get(0) + "\n");
        System.out.print("Row ten  :  " + al2d.get(10).get(0) + "\n");
        System.out.print("Row eleven  :  " + al2d.get(11).get(0) + "\n");

        //System.out.println("size of al2d row 5 " + al2d.get(5).size());

        for (int i = 0; i < al2d.size(); i++) {
            System.out.println(al2d.get(i));
        }


        //Using only loop
        System.out.println("Using only loop :");

        ArrayList<ArrayList<Integer>> al2d_loop = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++){
            al2d_loop.add(new ArrayList<>());
        }


        for (int i = 0; i < 10; i++) {
            al2d_loop.get(i).add(i*10);
            al2d_loop.get(i).add(i*20);
            al2d_loop.get(i).add(i*30);
            al2d_loop.get(i).add(i*40);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(al2d_loop.get(i));
        }

*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                setrowval(i,0);
        }

        setrowval(0,1,1);
        setrowval(0,3,1);
        setrowval(1,2,1);
        setrowval(2,3,1);
        setrowval(2,4,1);
        setrowval(3,4,1);

        System.out.print("   ");

        for (int i = 0; i < 5; i++){
            System.out.print("C" + i + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.println("R" + (i+1) + " " + al2d.get(i));
        }
    }

}
