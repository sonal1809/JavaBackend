package DesignPatterns.factory.Practice.Practice1;

import DesignPatterns.factory.Practice.Practice1.Button.AndroidButton;
import DesignPatterns.factory.Practice.Practice1.Button.Button;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
