package LLD1.Class1;

import java.util.ArrayList;
import java.util.List;

public class Transcation {
    private double balance;
    private List<String> transaction;

    public Transcation(double balance) {
        this.balance = balance;
        this.transaction = new ArrayList<>();
    }

    public Transcation() {
        this.transaction = new ArrayList<>();
        this.balance = 0.0;
    }


    public void deposit(int amt){
        if(amt > 0){
            this.transaction.add("Deposited $:" +amt);
            System.out.println("Successfully deposited..!!");
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(int amt){
        if (amt < this.balance){
            System.out.println("Cannot Withdraw as balance is low");
        }
        else if(amt <= 0){
            System.out.println("Invalid withdraw amount");
        }
        else{
            this.transaction.add("Withdraw $:" +amt);
            System.out.println("Withdrawl successfull!!!");
        }
    }

    public void printTranctionHistory(){
        transaction.stream().forEach(x-> System.out.println(x));
    }
}
