package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList;

    public AddressBook() {
        this.contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added: " + contact.getFirstName() + " " + contact.getLastName());
    }

    public void editContact(String firstName) {
        boolean found = false;
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                found = true;
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("New Address: "); contact.setAddress(sc.nextLine());
                System.out.print("New City: ");    contact.setCity(sc.nextLine());
                System.out.print("New State: ");   contact.setState(sc.nextLine());
                System.out.print("New Zip: ");     contact.setZip(sc.nextLine());
                System.out.print("New Phone: ");   contact.setPhoneNumber(sc.nextLine());
                System.out.print("New Email: ");   contact.setEmail(sc.nextLine());
                System.out.println("Contact updated successfully!");
                break;
            }
        }
        if (!found) System.out.println("Contact not found: " + firstName);
    }

    public void deleteContact(String firstName) {
        boolean removed = contactList.removeIf(
            contact -> contact.getFirstName().equalsIgnoreCase(firstName)
        );
        if (removed) System.out.println("Contact deleted: " + firstName);
        else System.out.println("Contact not found: " + firstName);
    }

    public void displayAllContacts() {
        if (contactList.isEmpty()) { System.out.println("No contacts found."); return; }
        System.out.println("---- All Contacts ----");
        contactList.forEach(System.out::println);
    }
}
