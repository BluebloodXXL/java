import java.util.*;
public class sort_arraylist {

    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> myarraylist = new ArrayList<>();


        for (int i =1; i <= 10; i++){
            myarraylist.add(rand.nextInt(100));
        }


        System.out.println("Before sorting " );
        for (int i : myarraylist){
            System.out.print(i + " ");
        }


        Collections.sort(myarraylist);
        System.out.println();


        System.out.println("After sorting " );
        for (int i : myarraylist){
            System.out.print(i + " ");
        }


        Comparator<Integer> compare = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1<o2)?1:-1;
            }
        };


        Collections.sort(myarraylist,compare);
        System.out.println();


        System.out.println("After reverse sorting " );
        for (int i : myarraylist) {
            System.out.print(i + " ");
        }


    }
}

