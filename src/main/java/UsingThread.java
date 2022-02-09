public class UsingThread extends Thread {


    public void run(){
        for (int i=0; i<=5;i++){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

        }

    }


    public static void main(String[] args) throws InterruptedException {
        UsingThread usingThread = new UsingThread();
        UsingRunnable usingRunnable = new UsingRunnable();
        Thread t1 = new Thread(usingRunnable);
        usingThread.start();
        usingThread.join();
        t1.start();
        System.out.println("Join implemented");
        System.out.println("Join implemented1");
        for (int i=0;i<=5;i++){
            System.out.println(i+" "+i);
        }

    }
}
