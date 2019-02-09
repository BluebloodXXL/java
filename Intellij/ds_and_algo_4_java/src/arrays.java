public class arrays {
    public static void main(String[] args) {

    //normal one dimensional array with specified size

        int index;
        index = 0;
        int normal_array[] = new int[5];

    //  int[] narmal_array = new int[5]; this could also be written

        for(int i = 0; i < normal_array.length; i++)      //initializing array value
            normal_array[i] = i+1;

        for(int i = 0; i < normal_array.length; i++)      //printing array value
            System.out.println(normal_array[i]);

        System.out.println();


    //normal one dimensional array with specified size
        int normal_sized_array[] = {10, 20, 30, 40, 50};

        for(int i = 0; i < normal_sized_array.length; i++)      //printing array value
            System.out.println(normal_sized_array[i]);

        System.out.println();

    //finding index of a certain value

        for(int i = 0; i < normal_sized_array.length; i++)
            if(normal_sized_array[i] == 40)
                index = i;

        System.out.println("Integer 40 is in the possition" + "\t\t" + index + "\n");
    }
}
