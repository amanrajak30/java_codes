import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;


    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void displayContact() {
        System.out.println("Name: " + name + ", Phone" +
                "e Number: " + phoneNumber);
    }
}

public class ContactBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Contact> contactList = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n--- Simple Contact Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter contact name: ");
                    String name = in.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = in.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    contactList.add(newContact);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:

                    System.out.println("\n--- All Contacts ---");
                    if (contactList.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (Contact contact : contactList) {
                            contact.displayContact();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter the name to search: ");
                    String searchName = in.nextLine();
                    boolean found = false;
                    for (Contact contact : contactList) {
                        if (contact.name.equalsIgnoreCase(searchName)) {
                            contact.displayContact();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:

                    System.out.print("Enter the name to delete: ");
                    String deleteName = in.nextLine();
                    boolean deleted = false;
                    for (Contact contact : contactList) {
                        if (contact.name.equalsIgnoreCase(deleteName)) {
                            contactList.remove(contact);
                            System.out.println("Contact deleted successfully.");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:

                    System.out.println("Exiting the contact book.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}