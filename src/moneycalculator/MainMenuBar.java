package moneycalculator;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MainMenuBar extends MenuBar {

    public MainMenuBar() {
        add(calculateMenu());
    }

    private Menu calculateMenu() {
        Menu menu = new Menu("Calculate");
        menu.add(setupMenuItem());
        menu.add(setupMenuItem());
        return menu;
    }

    private MenuItem setupMenuItem() {
        MenuItem menuItem = new MenuItem("Setup");
        return menuItem;
    }
    
    
}
