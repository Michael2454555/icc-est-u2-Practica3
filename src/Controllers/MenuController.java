package Controllers;
import Model.*;
import View.ConsoleView;
public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public void showMenu() {
        boolean running = true;
        while (running) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("Elija una opcion valida: ");
            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    consoleView.showMessage("Opcion Incorrecta intentelo de nuevo.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Ingrese el nombre: ");
        String phone = consoleView.getInput("Ingrese el numero telefonico: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contacto ananido.");
    }

    private void findContact() {
        String name = consoleView.getInput("Ingrese el nombre para buscar: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Encontrado: " + contact);
        } else {
            consoleView.showMessage("No existe el contacto.");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre a borrar: ");
        boolean deleted = contactManager.deleteContactByName(name);
        if (deleted) {
            consoleView.showMessage("Contacto borrado.");
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    private void printList() {
        contactManager.printList();
    }
}
