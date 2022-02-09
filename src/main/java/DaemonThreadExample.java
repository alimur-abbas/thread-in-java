
public class DaemonThreadExample extends Thread {
    public void run() {
            System.out.println("Name ->"+Thread.currentThread().getName());
            System.out.println("Daemon ->"+Thread.currentThread().isDaemon());
        }

    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample();
        t1.setDaemon(true);
      t1.start();


    }
}




