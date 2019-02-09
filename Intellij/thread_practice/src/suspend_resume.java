public class suspend_resume {
    public static void main(String[] args) throws Exception{


        SuspendResumeDemo t1 = new SuspendResumeDemo("A");
        SuspendResumeDemo t2 = new SuspendResumeDemo("B");
        SuspendResumeDemo t3 = new SuspendResumeDemo("C");


        t1.start();
        t2.start();
        t2.suspend(); // suspend() is deprecated
        t3.start();
        t2.resume(); // resume() is deprecated
    }
}

class SuspendResumeDemo extends Thread {
    private String threadName;

    SuspendResumeDemo(String name) {
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
