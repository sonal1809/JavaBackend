package LLD1.Concurrency.Executors;

public class NumberPrinter implements Runnable{

    private int numberPrinter;

    NumberPrinter(int numberPrinter){
        this.numberPrinter = numberPrinter;
    }


    @Override
    public void run() {
        if(numberPrinter % 2 == 0) {
            System.out.println(numberPrinter + "- Printed By: " + Thread.currentThread().getName());
        }
    }
}
