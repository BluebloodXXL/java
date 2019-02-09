public class test_random {

    static class test{
        test(){
            System.out.println("No value was given");
        }
        test(int x){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        test obj = new test(600);

    }
}
