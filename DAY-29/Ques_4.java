//Write a program to Create inventory management system.
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    
    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    
    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Price        : " + price);
    }

    
    public void addStock(int qty) {
        quantity += qty;
        System.out.println("Stock Updated Successfully!");
    }


    public void removeStock(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Stock Removed Successfully!");
        } else {
            System.out.println("Insufficient Stock!");
        }
    }

    
    public void inventoryValue() {
        System.out.println("Inventory Value = " + (quantity * price));
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Product product = new Product(id, name, quantity, price);

        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Product Details");
            System.out.println("2. Add Stock");
            System.out.println("3. Remove Stock");
            System.out.println("4. Show Inventory Value");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    product.display();
                    break;

                case 2:
                    System.out.print("Enter Quantity to Add: ");
                    int addQty = sc.nextInt();
                    product.addStock(addQty);
                    break;

                case 3:
                    System.out.print("Enter Quantity to Remove: ");
                    int removeQty = sc.nextInt();
                    product.removeStock(removeQty);
                    break;

                case 4:
                    product.inventoryValue();
                    break;

                case 5:
                    System.out.println("Thank You! Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}