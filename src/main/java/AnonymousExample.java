public class AnonymousExample {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("From Runnable interface");
            }
        };
        Thread t1 = new Thread() {
           public void run(){
               System.out.println("From thread class");
           }
        };
        t1.start();
        Thread abc = new Thread(r1);
        abc.start();
    }
}
