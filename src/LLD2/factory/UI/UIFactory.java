package LLD2.factory.UI;

import LLD2.factory.UI.Buttons.Button;
import LLD2.factory.UI.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
