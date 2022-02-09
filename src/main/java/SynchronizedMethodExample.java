class Customer {
    int amount = 10000;

       synchronized   void withdraw(int amount) {
           System.out.println(Thread.currentThread().getName());
        System.out.println("going to withdraw...");  //Synchronized Method


        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

      synchronized void deposit(int amount) {
          System.out.println(Thread.currentThread().getName());
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        notify();
    }
}


public class SynchronizedMethodExample {
    public static void main(String[] args) {
        Customer customer = new Customer();// only object is used
        Thread thread = new Thread(){
            public void run(){
                customer.withdraw(20000);
            }
        };
        thread.start();
        Thread t1 = new Thread(){
            public void run(){
                customer.deposit(15000);
            }
        };
        t1.start();
    }
}
