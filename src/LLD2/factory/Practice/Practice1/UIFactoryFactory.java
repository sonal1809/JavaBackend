package LLD2.factory.Practice.Practice1;

import LLD2.factory.UI.SupportedPlatforms;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        } else if (platform.equals(SupportedPlatforms.IOS)) {
            return new IOSUIFactory();
        }
        return null;
    }
}
