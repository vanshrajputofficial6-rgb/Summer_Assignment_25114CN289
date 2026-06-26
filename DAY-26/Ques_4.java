//Write aprogram to Create a quiz application.
import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. Which keyword is used to inherit a class in Java?",
            "4. Which company developed Java?",
            "5. What is the extension of Java source files?"
        };

        String[][] options = {
            {"A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"},
            {"A. Python", "B. Java", "C. C++", "D. Swift"},
            {"A. implements", "B. extends", "C. inherit", "D. super"},
            {"A. Microsoft", "B. Apple", "C. Sun Microsystems", "D. Google"},
            {"A. .class", "B. .java", "C. .txt", "D. .exe"}
        };

        
        char[] answers = {'B', 'B', 'B', 'C', 'B'};

        int score = 0;

        System.out.println("===== Welcome to the Quiz Application =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is " + answers[i]);
            }
        }


        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        if (score == questions.length) {
            System.out.println("Excellent! Perfect Score!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}
