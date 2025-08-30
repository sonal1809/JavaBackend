package DesignPatterns.factory.UI;

import DesignPatterns.factory.UI.Buttons.Button;
import DesignPatterns.factory.UI.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
