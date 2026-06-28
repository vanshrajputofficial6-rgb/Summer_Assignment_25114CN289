//Write a program to Create contact management system.
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Phone: " + phone);
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    contacts.add(new Contact(name, phone));
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("\n--- Contact List ---");
                        for (Contact c : contacts) {
                            c.display();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(searchName)) {
                            c.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Contact Management System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}