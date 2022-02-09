public class Locks implements Runnable{
        public void run() { Lock(); }
        public void Lock()
        {
            System.out.println(
                    Thread.currentThread().getName());
            synchronized (this)
            {
                System.out.println(
                        "in block "
                                + Thread.currentThread().getName());
                System.out.println(
                        "in block "
                                + Thread.currentThread().getName()
                                + " end");
            }
        }
// in the above block all the 3 thread will go but as t1 and t2 has same object and they have single lock
// so out of t1 ,t2 one will go in and complete it's before second enter.
// but thread 3 will enter with and one of t1 or t2 as it is not lock on same object.

        public static void main(String[] args)
        {
           Locks locks= new Locks() ;
            Thread t1 = new Thread(locks);
            Thread t2 = new Thread(locks);
           Locks locks1 = new Locks();
            Thread t3 = new Thread(locks1);
            t1.setName("t1");
            t2.setName("t2");
            t3.setName("t3");
            t1.start();
            t2.start();
            t3.start();
        }
    }


