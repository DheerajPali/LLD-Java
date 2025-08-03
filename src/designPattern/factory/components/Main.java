package designPattern.factory.components;

import designPattern.factory.components.button.Button;
import designPattern.factory.components.dropdown.Dropdown;
import designPattern.factory.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlateforms.ANDROID);
        UIFactory uiFactory =  flutter.uiFactory();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
        Button button = uiFactory.createButton();
    }

}
