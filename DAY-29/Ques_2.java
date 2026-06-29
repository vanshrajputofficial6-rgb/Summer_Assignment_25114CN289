//Write a program to Create menu-driven array operation system.
import java.util.Scanner;

class ArrayOperations {
    int[] arr;
    int size;

    
    public void inputArray(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    
    public void displayArray() {
        if (arr == null) {
            System.out.println("Array not created.");
            return;
        }

        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void findSum() {
        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }

    
    public void findMax() {
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maximum Element = " + max);
    }

    
    public void findMin() {
        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Minimum Element = " + min);
    }


    public void searchElement(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }
}

public class Ques_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayOperations obj = new ArrayOperations();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Find Sum");
            System.out.println("4. Find Maximum");
            System.out.println("5. Find Minimum");
            System.out.println("6. Search Element");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.inputArray(sc);
                    break;

                case 2:
                    obj.displayArray();
                    break;

                case 3:
                    obj.findSum();
                    break;

                case 4:
                    obj.findMax();
                    break;

                case 5:
                    obj.findMin();
                    break;

                case 6:
                    if (obj.arr == null) {
                        System.out.println("Please create the array first.");
                    } else {
                        System.out.print("Enter element to search: ");
                        int key = sc.nextInt();
                        obj.searchElement(key);
                    }
                    break;

                case 7:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}