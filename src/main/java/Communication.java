class MyThread implements Runnable{
    int total;
    public void run() {
        for(int i=1; i<=1000; i++) {
            total = total+i;
            if(total>10000) {
                synchronized(this) {
                    notify();
                }
            }
            try {
                Thread.sleep(5);
            }
            catch(InterruptedException ie) {}
        }
        System.out.println("User Thread total:" +total);
    }
}
public class Communication {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        try {
            synchronized(mt) {
                mt.wait();
            }
        }
        catch(InterruptedException ie) {}
        System.out.println("Main Thread total:"+mt.total);
    }
}