//Write a program to Create number gusssing game.
import java.util.Random;
import java.util.Scanner;
    class Game {
        public int num;
        public int inputNumber;
        public int noOfTry = 0;
    
    Game() {
        Random rand = new Random();
        this.num = rand.nextInt(100) + 1;
    }
    int takeUserInput(){
        System.out.print("Enter your guess: ");
        Scanner sc = new Scanner(System.in);
        this.inputNumber = sc.nextInt();
        return inputNumber;
    }
    boolean iscorrectNumber(){
        while(true){
            takeUserInput();
            noOfTry++;
            if(num == inputNumber){
                System.out.println("You Won!");
                System.out.println("In " + noOfTry + " of tries.");
                return true;
            }else if(num < inputNumber){
                System.out.println("Too High");
            }else if(num > inputNumber){
                System.out.println("Too Low");
            }else{
                System.out.println("Enter valid number(1-100)");
            }
            }
        }
    }
 public class Ques_1{   
    public static void main(String[]args){
            Game g = new Game();
            g.iscorrectNumber();
    }
}