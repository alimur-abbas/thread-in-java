public class ThreadGroupExample implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupExample threadGroup = new ThreadGroupExample();
        ThreadGroup t = new ThreadGroup("Alimur");
        Thread t1 = new Thread(t,threadGroup,"Ali-1");
        t1.start();
        Thread t2 = new Thread(t,threadGroup,"Ali-2");
        t2.start();
        Thread t3 = new Thread(t,threadGroup,"Ali-3");
        t3.start();
        System.out.println("Name of thread group"+t.getName());
        t.list();
    }
}
