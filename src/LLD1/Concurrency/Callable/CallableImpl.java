package LLD1.Concurrency.Callable;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable {


    @Override
    public Integer call() throws Exception {
        System.out.println("Callable is running");
        return 21;
    }
}
