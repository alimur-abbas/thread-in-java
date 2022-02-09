public class ThreadPool  extends Thread {
    private String thread;

    public ThreadPool(String name) {
        this.thread = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start thread = " + thread);
       processmessage();//sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName() + " End ");//prints thread name  
    }

    private void processmessage() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}