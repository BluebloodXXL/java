import java.util.*;

public class arrays_of_lists {
    static List<Integer> arrays_arraylist[] = new LinkedList[50];
    static int  go =0;

    static void setindex(int array_index){
        if(arrays_arraylist.length == 0 || arrays_arraylist.length < 0){
            for (int i = 0; i < array_index; i++) {
                arrays_arraylist[i] = new LinkedList<>();
                go = i;
            }

        }
        else {
            for (int i = go; i < array_index; i++){
                arrays_arraylist[i] = new LinkedList<>();
                go = i;
            }
        }
    }

    public static void main(String[] args){
        setindex(10);

        arrays_arraylist[2].add(50);
        arrays_arraylist[2].add(200);
        arrays_arraylist[3].add(90);

        for(int i = 1; i < 10; i++)
            System.out.println(arrays_arraylist[i]);

        setindex(20);

        for(int i = 1; i < 10; i++)
            System.out.println(arrays_arraylist[i]);

    }


}
