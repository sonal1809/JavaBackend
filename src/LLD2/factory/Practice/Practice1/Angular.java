package LLD2.factory.Practice.Practice1;

import LLD2.factory.UI.SupportedPlatforms;

public class Angular {
    public void getRefresh(){
        System.out.println("System is getting refreshed");
    }

    public void setTheme(){
        System.out.println("Theme set");
    }

    UIFactory getUIFactoryPlatform(SupportedPlatforms platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
