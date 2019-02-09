public class thread_basic_1 {

    public static void main(String[] args) {
        A obj = new A();
        obj.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("take " + i + "from Main");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("take " + i + "from Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}