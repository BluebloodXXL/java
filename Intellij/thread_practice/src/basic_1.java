public class basic_1 {
    public static void main(String[] args) throws Exception {
        IMR objIMRD = new IMR();
        Thread thrdIMR = new Thread(objIMRD);
        EXT objEXTA = new EXT("A");
        EXT objEXTB = new EXT("B");
        EXT objEXTC = new EXT("C");
        thrdIMR.start();
        objEXTA.start();
        objEXTB.start();
        thrdIMR.suspend();
        objEXTC.start();
        objEXTA.setPriority(Thread.MIN_PRIORITY);
        objEXTB.setPriority(Thread.MAX_PRIORITY);
        objEXTC.setPriority(Thread.NORM_PRIORITY);
        thrdIMR.setPriority(Thread.NORM_PRIORITY);
        thrdIMR.resume();
    }
}
class EXT extends Thread {
    String Classname;
    EXT(String name) {
        Classname = name;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("take " + i + "from class   " + Classname + "   extending thread");
        }
    }
}
class IMR implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("take " + i + "from class   IMR   extending thread");
        }
    }
}
