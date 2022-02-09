public class UsingRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println("Thread created using Runnable interface");
        }

    }

    public static void main(String[] args) {
//        UsingRunnable usingRunnable = new UsingRunnable();
//        Thread thread = new Thread(usingRunnable, "Alimur");
//        thread.start();
////        System.out.println(thread.getName());
////        thread.setName("Ali");
//        System.out.println(thread.getName());
//        System.out.println(thread.getId());
//        System.out.println(thread.getPriority());
////        thread.setPriority(1);
////        System.out.println(thread.getPriority());
    }
}
