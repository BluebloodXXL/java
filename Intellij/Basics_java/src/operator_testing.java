public class operator_testing {
    public static void main(String[] args) {

        // We are going to test different types of operators here.
        double x = 20d, y = 80d, z;
        z = (double)((x + y) * 25);

        if ((z % 40) <= 20)
            System.out.printf("Total is %3.3f which is over the limit.\n", (z % 40));
    }

}
