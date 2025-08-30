package DesignPatterns.decorator;

public class OrangeCone implements IceCream{
    // Orange Cone is only a base add on

    // public OrangeCone(){}  // Not required to provide



    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
