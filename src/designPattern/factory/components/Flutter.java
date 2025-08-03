package designPattern.factory.components;

public class Flutter {
    private SupportedPlateforms plateform;

    public  Flutter(SupportedPlateforms plateform){
        this.plateform = plateform;
    }

    public void setTheme(){

    }

    public void makeSound(){

    }

    public UIFactory uiFactory(){
        return UIFactoryFactory.getUIFactory(plateform);
    }

}
