class Pen{}
class Paper{}
public class DeadLock {
    public static void main(String[] args) {

        final Pen pn = new Pen();
        final Paper pr = new Paper();

        Thread t1 = new Thread() {
            public void run() {
                synchronized (pn) {
                    System.out.println("Thread1 is holding Pen");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                    }
                    synchronized (pr) {
                        System.out.println("Requesting for Paper");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (pr) {
                    System.out.println("Thread2 is holding Paper");
//                    try {
////                        Thread.sleep(1000);
//                    } catch (InterruptedException ne) {
//                    }
                    synchronized (pn) {
                        System.out.println("requesting for Pen");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
//After executing pn thread-1 waits for pr to be unlock but thread-1 has not unlock pn as it need pr to complete the task and unlock pn
//After executing pr thread-2 waits for pn to be unlock but thread-2 has not unlock pr as it need pn to complete the task and unlock pr
// Hence it end-up as dead-lock.
