package LLD1.Oops.Practice;

public class Driver extends Person implements workable{


    public Driver(String name, int age, Address address) {
        super(name, age, address);
    }

    @Override
    public void doWork() {
        System.out.println("Driver is driving");
    }
}
