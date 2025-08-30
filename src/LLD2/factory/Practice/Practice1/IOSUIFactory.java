package LLD2.factory.Practice.Practice1;

import LLD2.factory.Practice.Practice1.Button.Button;
import LLD2.factory.Practice.Practice1.Button.IOSButton;

public class IOSUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
