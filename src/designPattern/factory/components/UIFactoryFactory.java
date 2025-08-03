package designPattern.factory.components;

import java.lang.classfile.instruction.SwitchCase;

public class UIFactoryFactory {
//    private SupportedPlateforms plateforms;

    public static UIFactory getUIFactory(SupportedPlateforms plateforms){
        return switch (plateforms) {
            case ANDROID -> new AndroidFactory();
            case IOS -> new IosFactory();
        };
    }

}
