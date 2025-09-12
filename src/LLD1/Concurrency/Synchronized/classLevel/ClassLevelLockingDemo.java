package LLD1.Concurrency.Synchronized.classLevel;

public class ClassLevelLockingDemo {

    static class Worker {

        // Class-level lock: both methods lock on Worker.class
        public static synchronized void taskA() {
            String t = Thread.currentThread().getName();
            System.out.println(t + " entered taskA");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(t + " leaving taskA");
        }

        public static synchronized void taskB() {
            String t = Thread.currentThread().getName();
            System.out.println(t + " entered taskB");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(t + " leaving taskB");
        }
    }

    public static void main(String[] args) {
        // Even though we create two instances,
        // static synchronized methods will use the same class-level lock
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        Thread t1 = new Thread(() -> w1.taskA(), "Thread-1");
        Thread t2 = new Thread(() -> w2.taskB(), "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}

        System.out.println("Main finished");
    }
}

// Because both taskA and taskB are static synchronized,
// they lock on the same monitor: Worker.class. So only one thread can run inside either method at a time.

//  Thread-1 entered taskA
//  Thread-1 leaving taskA
//  Thread-2 entered taskB
//  Thread-2 leaving taskB
//  Main finished

// OR

//    Thread-2 entered taskB
//    Thread-2 leaving taskB
//    Thread-1 entered taskA
//    Thread-1 leaving taskA
//    Main finished



