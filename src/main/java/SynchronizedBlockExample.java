

class Table {

    void printTable(int n) {
        synchronized (this) {//synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+" "+n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//end of the method
}

class MyThreadClass1 extends Thread {
    Table t;

    MyThreadClass1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class MyThreadClass2 extends Thread {
    Table t;

    MyThreadClass2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class SynchronizedBlockExample {

    public static void main(String args[]) {
        Table obj = new Table();//only one object used
        MyThreadClass1 t1 = new MyThreadClass1(obj);
        MyThreadClass2 t2 = new MyThreadClass2(obj);
        t1.start();
        t2.start();
    }
}

