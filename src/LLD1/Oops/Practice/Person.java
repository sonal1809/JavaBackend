package LLD1.Oops.Practice;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name , int age , Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void doEat(){
        System.out.println("Person is eating");
    }

    public void doSleep(){
        System.out.println("Person is sleeping");
    }
}
