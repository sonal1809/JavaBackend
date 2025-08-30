package DesignPatterns.factory.UI;

import DesignPatterns.factory.UI.Buttons.Button;
import DesignPatterns.factory.UI.Menu.Menu;

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
