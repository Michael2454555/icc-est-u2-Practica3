import Controllers.ContactManager;
import Controllers.MenuController;
import View.ConsoleView;

public class App {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        ConsoleView consoleView = new ConsoleView();
        MenuController menuController = new MenuController(contactManager, consoleView);
        menuController.showMenu();
    }
}