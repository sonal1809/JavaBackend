package LLD1.Class1;

public class TranscationClient {
    public static void main(String[] args) {
        Transcation t1 = new Transcation();
        t1.deposit(1000);
        t1.deposit(2000);
        t1.withdraw(1000);
        t1.withdraw(500);
        t1.deposit(5000);

        t1.printTranctionHistory();
    }
}
