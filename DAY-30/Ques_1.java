//Write a program to Create student record system using arrays and strings.
import java.util.Scanner;
public class Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of students: ");
        n = sc.nextInt();

        int[] rollNo = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Roll Number: ");
            rollNo[i] = sc.nextInt();

            sc.nextLine(); 

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Age: ");
            age[i] = sc.nextInt();
        }

    
        System.out.println("\n===== STUDENT RECORDS =====");
        System.out.printf("%-10s %-20s %-10s%n", "Roll No", "Name", "Age");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-10d%n",
                    rollNo[i], name[i], age[i]);
        }

        sc.close();
    }
}

