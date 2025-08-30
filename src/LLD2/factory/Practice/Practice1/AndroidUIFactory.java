package LLD2.factory.Practice.Practice1;

import LLD2.factory.Practice.Practice1.Button.AndroidButton;
import LLD2.factory.Practice.Practice1.Button.Button;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
