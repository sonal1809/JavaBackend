package LLD2.decorator;

public class ChocolateCone implements IceCream{
    // Chocolate cone should behave as base and well as Addon

    private IceCream iceCream;

    // For Addon , we need to have custom constructor
    public ChocolateCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    // For Base add on we need to have default constructor
    public ChocolateCone(){}


    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return iceCream.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";

    }
}
