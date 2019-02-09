class Counter{
    int count;
    public synchronized void increament(){
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        //c.increament();

        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 1000; i++){
                    c.increament();
                }
            }
        });

        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 1000; i++){
                    c.increament();
                }
            }
        });

        T1.start();
        T2.start();

        T1.join();
        T2.join();

        System.out.println("count is " + c.count);

    }
}
