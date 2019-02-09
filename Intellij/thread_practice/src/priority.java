public class priority {
    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("A");
        PriorityDemo t2 = new PriorityDemo("B");
        PriorityDemo t3 = new PriorityDemo("C");

        t1.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY);
    }
}

class PriorityDemo extends Thread {
    private String threadName;

    PriorityDemo(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " starts.");
        for (int i = 1; i <= 10; i++) {
            System.out.println("From " + threadName + " : " + i);
        }
        System.out.println("Thread " + threadName + " ends.");
    }
}