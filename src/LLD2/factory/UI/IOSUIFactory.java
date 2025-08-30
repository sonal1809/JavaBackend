package LLD2.factory.UI;

import LLD2.factory.UI.Buttons.Button;
import LLD2.factory.UI.Buttons.IOSButton;
import LLD2.factory.UI.Menu.IOSMenu;
import LLD2.factory.UI.Menu.Menu;

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
