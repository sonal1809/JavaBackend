package LLD1.Oops.Practice;

public class Manager extends Person implements workable{

    public Manager(String name , int age , Address address){
        super(name, age , address);
    }

    @Override
    public void doWork() {
        System.out.println("Manager is working");
    }
}
