//Write a program to Develop complete ,imi projrct Using arrays, strings and functions.
import java.util.Scanner;
public class Ques_4 {
    static String secretWord = "APPLE";
    static int maxAttempts = 6;

    
    static boolean isCorrect(String guess) {
        return guess.equals(secretWord);
    }

    
    static void displayHint(String guess) {
        System.out.print("Hint: ");

        for (int i = 0; i < secretWord.length(); i++) {
            char ch = guess.charAt(i);

            if (ch == secretWord.charAt(i)) {
                
                System.out.print("[G] ");
            } else if (secretWord.indexOf(ch) != -1) {
                
                System.out.print("[Y] ");
            } else {
            
                System.out.print("[X] ");
            }
        }

        System.out.println();
        System.out.println("[G] = Correct Letter & Position");
        System.out.println("[Y] = Correct Letter, Wrong Position");
        System.out.println("[X] = Letter Not Present");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      WORD GUESSING GAME");
        System.out.println("================================");
        System.out.println("Guess the 5-letter word.");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.print("Attempt " + attempt + ": ");
            String guess = sc.next().toUpperCase();

            // Check length
            if (guess.length() != 5) {
                System.out.println("Please enter exactly 5 letters.");
                attempt--;
                continue;
            }

            if (isCorrect(guess)) {
                System.out.println("\nCongratulations! You guessed the word correctly.");
                System.out.println("Secret Word: " + secretWord);
                sc.close();
                return;
            }

            displayHint(guess);
            System.out.println();
        }

        System.out.println("Game Over!");
        System.out.println("The correct word was: " + secretWord);

        sc.close();
    }
}   
