package LLD1.Oops.Practice.Polymorphism;

public class Client {

    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();

        a.method();
        a1.method();
    }
}
