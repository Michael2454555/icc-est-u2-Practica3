package View;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public void Menu() {
        System.out.println("1. Anadir contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Mostrar contacto");
        System.out.println("5. Salir");
    }

    public String getInput(String ingresarMessage) {
        System.out.print(ingresarMessage);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}