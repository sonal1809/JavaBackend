package DesignPatterns.factory.UI.Buttons;

public class IOSButton implements Button{

    @Override
    public void Click() {
        System.out.println("IOS button is clicked");
    }
}
