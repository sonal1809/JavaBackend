package DesignPatterns.strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Giridih", "Bokaro" , "Car");
    }
}
