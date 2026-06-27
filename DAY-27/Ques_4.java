//Write  a program to Create marksheet generation system.
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks;
    int total;
    double percentage;
    String grade;

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculateResult();
    }

    
    public void calculateResult() {
        total = 0;

        for (int mark : marks) {
            total += mark;
        }

        percentage = total / (double) marks.length;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    public void displayMarksheet() {
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total   : " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade   : " + grade);
        System.out.println("================================\n");
    }
}


public class Ques_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--; 
            }
        }

        Student s = new Student(rollNo, name, marks);
        s.displayMarksheet();

        sc.close();
    }
}