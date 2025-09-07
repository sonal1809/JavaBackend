package LLD1.Concurrency.Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample{
    public static void main(String[] args) {

        // 1. using thread
//        Thread T = new Thread();
//        T.start();


        // Using Executor Service
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableImpl());
        executorService.shutdown();
    }
}
