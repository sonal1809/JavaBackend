package LLD2.factory.UI;

import LLD2.factory.UI.Buttons.Button;
import LLD2.factory.UI.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactoryForPlatform(SupportedPlatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.Click();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
