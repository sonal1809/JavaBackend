package DesignPatterns.factory.UI;

import DesignPatterns.factory.UI.Buttons.Button;
import DesignPatterns.factory.UI.Buttons.IOSButton;
import DesignPatterns.factory.UI.Menu.IOSMenu;
import DesignPatterns.factory.UI.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
