class Bank extends Thread{
     static int bal=5000;
     static int withdraw;
    Bank( int withdraw){
        this.withdraw=withdraw;
    }
    public static   synchronized void withdrawn(){
        System.out.print(Thread.currentThread().getName()+" ");
        if (withdraw<=bal){
            System.out.println("has withdrawn the money");
            bal=bal-withdraw;
        }
        else{
            System.out.println(", Sorry we don't have sufficient balance");
        }
    }
    public void run(){
        withdrawn();
    }
}
public class UsingStatic {
    public static void main(String[] args) {
    Bank ob1 = new Bank(5000);
    Bank ob2 = new Bank(5000);
    Thread t1 = new Thread(ob1);
    Thread t2 = new Thread(ob1);
    t1.setName("Ali");
    t2.setName("Saroj");
    Thread t3 = new Thread(ob2);
    Thread t4 = new Thread(ob2);
    t3.setName("Suman");
    t4.setName("Sid");
    t1.start();t2.start();
    t3.start();t4.start();


}
    }