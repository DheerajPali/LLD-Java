package designPattern.factory.components;

import designPattern.factory.components.button.AndroidButton;
import designPattern.factory.components.button.Button;
import designPattern.factory.components.dropdown.AndroidDropdown;
import designPattern.factory.components.dropdown.Dropdown;
import designPattern.factory.components.menu.AndroidMenu;
import designPattern.factory.components.menu.Menu;

public class AndroidFactory implements UIFactory{

    @Override
    public Menu createMenu(){
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown(){
        return new AndroidDropdown();
    }

    @Override
    public Button createButton(){
        return new AndroidButton();
    }
}
