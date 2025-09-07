package LLD1.Concurrency.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(new CallableImpl());

        // Get result (blocks until task completes)
        Integer result = future.get();
        System.out.println("Result from Callable: " + result);

        executorService.shutdown();
    }
}
