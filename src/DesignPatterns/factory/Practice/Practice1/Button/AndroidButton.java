package DesignPatterns.factory.Practice.Practice1.Button;

public class AndroidButton implements Button{

    @Override
    public void click() {
        System.out.println("Android Button clicks");
    }
}
