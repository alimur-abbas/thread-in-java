import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main extends Thread{
    public void run(){
        for (int i=0; i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
//       Main main = new Main();
//       main.setPriority(Thread.NORM_PRIORITY);
//       main.start();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i <= 9; i++) {
            Thread t = new ThreadPool("" + i);
            service.execute(t);
        }service.shutdown();

        while (!service.isTerminated()) {
        }
        System.out.println("All threads are finish");


    }
}
