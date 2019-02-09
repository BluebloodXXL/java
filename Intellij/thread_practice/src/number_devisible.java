public class number_devisible {
    public static void main(String[] args) throws Exception{
        DivBy3 d3 = new DivBy3();
        DivBy5 d5 = new DivBy5();

        Thread t3 = new Thread(d3);
        Thread t5 = new Thread(d5);

        t3.start();

        t3.join();

        t5.start();
    }
}


class DivBy3 implements Runnable {
    @Override
    public void run() {
        for (int i = 3; i <= 100; i += 3) {
            System.out.println(i + " is divisible by 3");
        }
    }
}


class DivBy5 implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println(i + " is divisible by 5");
        }
    }
}