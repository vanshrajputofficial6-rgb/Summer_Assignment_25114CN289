//Create a program to Create voting eligibility system.
import java.util.Scanner;
class VotingEligibilitySystem{
    public int Age;

    VotingEligibilitySystem(){
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        this.Age = sc.nextInt();
    }
    boolean checkEligible(){
        if(Age >= 18){
            System.out.println("You are eligible for voting");
            return true;
        }else{
            System.out.println("You are not e;iginle foro voting");
        }
        return false;
    }
}
public class Ques_2{
    public static void main(String[]args){
     VotingEligibilitySystem A = new VotingEligibilitySystem();
     A.checkEligible();
    }
}