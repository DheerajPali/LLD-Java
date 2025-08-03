

package designPattern.factory.components;

import designPattern.factory.components.button.Button;
import designPattern.factory.components.button.IoSButton;
import designPattern.factory.components.dropdown.Dropdown;
import designPattern.factory.components.dropdown.IoSDropdown;
import designPattern.factory.components.menu.IoSMenu;
import designPattern.factory.components.menu.Menu;

public class IosFactory implements UIFactory {

   @Override
    public Menu createMenu(){
       return new IoSMenu();
   }

   @Override
    public Dropdown createDropdown(){
       return new IoSDropdown();
   }

   @Override
    public Button createButton(){
       return  new IoSButton();
   }


}
