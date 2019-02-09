public class thread_as_mains_child extends Thread{
    public static void main(String[] args) {

        // getting reference to main thread
        Thread mainThread = Thread.currentThread();

        // main thread creates a child thread
        ChildThread childThread = new ChildThread();

        // starting child thread
        childThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("From Main Thread: " + i);
        }

    }
}

class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Child Thread: " + i);
        }
    }
}