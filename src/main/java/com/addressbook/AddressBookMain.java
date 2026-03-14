package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        // Add a sample contact
        Contact contact = new Contact("Kalees", "E", "123 Main St", "Chennai", "TN", "600001", "9999999999", "kalees@test.com");
        addressBook.addContact(contact);

        // Edit contact
        System.out.print("Enter First Name to Edit: ");
        String editName = scanner.nextLine();
        addressBook.editContact(editName);
        addressBook.displayAllContacts();

        scanner.close();
    }
}
