package designPattern.factory.components;

import designPattern.factory.components.button.Button;
import designPattern.factory.components.dropdown.Dropdown;
import designPattern.factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Dropdown createDropdown();
    Button createButton();
}
