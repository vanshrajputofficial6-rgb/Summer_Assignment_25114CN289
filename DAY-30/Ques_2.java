//Write a program to Create mini library system.
import java.util.Scanner;
public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        int[] bookId = new int[n];
        String[] bookName = new String[n];
        String[] author = new String[n];

    
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            bookId[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Book Name: ");
            bookName[i] = sc.nextLine();

            System.out.print("Enter Author Name: ");
            author[i] = sc.nextLine();
        }

        
        System.out.println("\n===== MINI LIBRARY SYSTEM =====");
        System.out.printf("%-10s %-25s %-20s%n", "Book ID", "Book Name", "Author");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-25s %-20s%n",
                    bookId[i], bookName[i], author[i]);
        }

        sc.close();
    }
}

