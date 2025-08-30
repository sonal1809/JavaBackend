package DesignPatterns.factory.UI;

import DesignPatterns.factory.UI.Buttons.AndroidButton;
import DesignPatterns.factory.UI.Buttons.Button;
import DesignPatterns.factory.UI.Menu.AndroidMenu;
import DesignPatterns.factory.UI.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
