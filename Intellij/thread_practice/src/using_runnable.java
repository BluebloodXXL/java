public class using_runnable {

    public void whatever(){
        System.out.println("Whatever code you have outside of run method will not be printed if you are using thread");
    }

    public static void main(String[] args) throws Exception{
        A1 obj1 = new A1();
        B1 obj2 = new B1();
        C1 obj3 = new C1();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        t1.start();
            //try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
        t2.start();
        //t2.suspend();
        t3.start();
        //t2.resume();
    }
}
class A1 implements Runnable {
    A1(){
        System.out.println("From A1");
    }
    public void whatever(){
        System.out.println("Whatever code you have outside of run method will not be printed if you are using thread");
    }
    @Override
    public void run() {
        int i = 1;
        while (i <= 5) {
            System.out.println("take " + i + " from A1");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B1 implements Runnable {

    B1(){
        System.out.println("From B1");
    }



    @Override
    public void run() {
        int i = 1;
        while (i <= 5) {
            System.out.println("take " + i + " from B1");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class C1 implements Runnable {

    C1(){
        System.out.println("From C1");
    }

    public void whatever(){
        System.out.println("Whatever code you have outside of run method will not be printed if you are using thread");
    }

    @Override
    public void run() {
        int i = 1;
        while (i <= 5) {
            System.out.println("take " + i + " from C1");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

