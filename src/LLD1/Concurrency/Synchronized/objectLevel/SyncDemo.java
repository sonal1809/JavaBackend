package LLD1.Concurrency.Synchronized.objectLevel;

public class SyncDemo {

    // A class with two synchronized instance methods
    static class Worker {
        public synchronized void taskA() {
            String t = Thread.currentThread().getName();
            System.out.println(t + " entered taskA");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {}
            System.out.println(t + " leaving taskA");
        }

        public synchronized void taskB() {
            String t = Thread.currentThread().getName();
            System.out.println(t + " entered taskB");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {}
            System.out.println(t + " leaving taskB");
        }
    }

    public static void main(String[] args) {

        // Because Thread-1 and Thread-2 attempt synchronized methods on the same instance,
        // their execution will be serialized. The exact order depends on thread scheduling,
        // but a typical run (if Thread-1 grabs the lock first) will print:

//        Thread-1 entered taskA
//        Thread-1 leaving taskA
//        Thread-2 entered taskB
//        Thread-2 leaving taskB
//        Main finished


//        Worker sharedWorker = new Worker();
//
//        Thread t1 = new Thread(() -> sharedWorker.taskA(), "Thread-1");
//        Thread t2 = new Thread(() -> sharedWorker.taskB(), "Thread-2");

//        t1.start();
//        t2.start();




        // Each thread synchronizes on a different this (w1 vs w2).
        // No mutual exclusion between them — they can run concurrently (interleaved output)

//        Thread-1 entered taskA
//        Thread-2 entered taskB
//        Thread-1 leaving taskA
//        Thread-2 leaving taskB

        // Different object instance
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Thread t1 = new Thread(() -> w1.taskA(), "Thread-1");
        Thread t2 = new Thread(() -> w2.taskB(), "Thread-2");

        t1.start();
        t2.start();




        // wait for threads to finish (optional)
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) { }
        System.out.println("Main finished");
    }
}

