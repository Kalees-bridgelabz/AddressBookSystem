package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        // Add sample contacts
        addressBook.addContact(new Contact("Kalees", "E", "123 Main St", "Chennai", "TN", "600001", "9999999999", "kalees@test.com"));
        addressBook.addContact(new Contact("Ravi", "K", "456 Park Ave", "Bangalore", "KA", "560001", "8888888888", "ravi@test.com"));

        // Delete contact
        System.out.print("Enter First Name to Delete: ");
        String deleteName = scanner.nextLine();
        addressBook.deleteContact(deleteName);
        addressBook.displayAllContacts();

        scanner.close();
    }
}
