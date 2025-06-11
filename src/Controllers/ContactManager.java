package Controllers;

import Model.*;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            Contact<?, ?> contact = current.getValue();
            if (contact.getName().toString().equalsIgnoreCase(name)) {
                return contact;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            Contact<?, ?> contact = current.getValue();
            if (contact.getName().toString().equalsIgnoreCase(name)) {
                return contacts.deleteByValue(contact);
            }
            current = current.getNext();
        }
        return false;
    }

    public void printList() {
        contacts.print();
    }
}
