//Write a program to Create bank account system.
import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    
    BankAccount(String name, int accNo, double initialBalance) {
        accountHolder = name;
        accountNumber = accNo;
        balance = initialBalance;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    
    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}

public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, balance);

        int choice;
        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.display();
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}