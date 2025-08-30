package LLD2.factory.UI;

public class Flutter {

    void refreshUI(){
        System.out.println("UI is refreshed");
    }

    void setTheme(){
        System.out.println("Setting theme");
    }

    UIFactory getUIFactoryForPlatform(SupportedPlatforms platform){
//        if(platform.equals(SupportedPlatforms.ANDROID)){
//            return new AndroidUIFactory();
//        } else if (platform.equals(SupportedPlatforms.IOS)) {
//            return new IOSUIFactory();
//        }
//        return null;

        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
