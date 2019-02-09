public class benefit_runnable {
    public static void main(String[] args) {

        RunnableDemo obj1 = new RunnableDemo();
        //RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(obj1);
        thread.start();

    }
}


class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread starts.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Thread ends.");
    }
}