package DesignPatterns.factory.Practice.Practice1;

import DesignPatterns.factory.Practice.Practice1.Button.Button;
import DesignPatterns.factory.Practice.Practice1.Button.IOSButton;

public class IOSUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
