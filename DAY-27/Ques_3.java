//Write a program to Create Salary management system.
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;
    double allowance;
    double deduction;

    public Employee(int id, String name, double basicSalary, double allowance, double deduction) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
    }

    public double calculateSalary() {
        return basicSalary + allowance - deduction;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Salary: " + calculateSalary());
        System.out.println("-----------------------------");
    }
}

public class Ques_3{

    static ArrayList<Employee> employees = new ArrayList<>();

    public static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();

        employees.add(new Employee(id, name, basic, allowance, deduction));

        System.out.println("Employee added successfully!\n");
    }

    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.\n");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    public static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.id == id) {
                e.display();
                return;
            }
        }

        System.out.println("Employee not found.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Salary Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee(sc);
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.\n");
            }

        } while (choice != 4);

        sc.close();
    }
}