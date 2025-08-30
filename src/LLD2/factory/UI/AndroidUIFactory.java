package LLD2.factory.UI;

import LLD2.factory.UI.Buttons.AndroidButton;
import LLD2.factory.UI.Buttons.Button;
import LLD2.factory.UI.Menu.AndroidMenu;
import LLD2.factory.UI.Menu.Menu;

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
