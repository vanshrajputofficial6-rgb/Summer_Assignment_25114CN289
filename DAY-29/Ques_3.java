//Write a program to Create menu-driven string operation system.
import java.util.Scanner;

class StringOperations {
    private String str;


    public StringOperations(String str) {
        this.str = str;
    }

    
    public void length() {
        System.out.println("Length of string: " + str.length());
    }

    
    public void toUpper() {
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    
    public void toLower() {
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    
    public void reverse() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }

    
    public void compare(String another) {
        if (str.equals(another))
            System.out.println("Strings are Equal.");
        else
            System.out.println("Strings are Not Equal.");
    }

    
    public void concatenate(String another) {
        System.out.println("Concatenated String: " + str.concat(another));
    }
}

public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringOperations obj = new StringOperations(input);

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Compare with Another String");
            System.out.println("6. Concatenate Another String");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    obj.length();
                    break;

                case 2:
                    obj.toUpper();
                    break;

                case 3:
                    obj.toLower();
                    break;

                case 4:
                    obj.reverse();
                    break;

                case 5:
                    System.out.print("Enter another string: ");
                    String str2 = sc.nextLine();
                    obj.compare(str2);
                    break;

                case 6:
                    System.out.print("Enter another string: ");
                    String str3 = sc.nextLine();
                    obj.concatenate(str3);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}