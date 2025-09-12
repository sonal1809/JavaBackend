package LLD1.Concurrency.DeadLock;

public class DeadlockDemo {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: holding lock1....");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread-1: Waiting for lock2...");
                synchronized (lock2) {
                    System.out.println("Thread-1: Acquired lock2!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread-2: Holding lock2...");

                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {}

                System.out.println("Thread-2: Waiting for lock1...");
                synchronized (lock1) {
                    System.out.println("Thread-2: Acquired lock1!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}


//    Explanation of Deadlock
//    Thread-1 acquires lock1.
//    Thread-2 acquires lock2.
//    Thread-1 then tries to acquire lock2 (already held by Thread-2).
//    Thread-2 tries to acquire lock1 (already held by Thread-1).
//    Both threads are stuck forever → deadlock.