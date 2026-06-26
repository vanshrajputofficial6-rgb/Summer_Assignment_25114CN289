//Write a program to Create ATM simulation.
import java.util.Scanner;
class ATM{
    private double balance;
    private int pin;

    ATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public boolean verifyPin(int enterPin){
        return this.pin == enterPin;
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }
    
    public void deposit(double amount){
       if(amount > 0){
        balance = balance + amount;
        System.out.println("Rs." + amount + " Succesfully Deposited!");
        System.out.println("Updated Balance: " + balance);
        }else{
        System.out.println("Invalid Amount");
       }    
    }

    public void withdraw(double amount){
       if(amount <= 0){
        System.out.println("Invalid Amount");
       }else if(amount > balance){
        System.out.println("Insufficient Balance");
       }else{
        balance = balance - amount;
        System.out.println("Rs." + amount + " Withdrwan Succesfully!");
        System.out.println("Updated balance: " + balance);
       }
    }

}
    public class Ques_3{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            ATM atm = new ATM(10000, 2210);
            int attempts = 0;
            boolean login = false;
           
            while(attempts < 3){
                System.out.println("Enter the PIN: ");
                int PIN = sc.nextInt();

                if(atm.verifyPin(PIN)){
                    login = true;
                    break;
                }else{
                    attempts++;
                    int rattempts = 3 - attempts;
                    System.out.println("Invalid PIN");

                    if(attempts < 3){
                        System.out.println("Attempts left: " + rattempts + "s");
                        }
                    }
                }    
                
                if(!login){
                    System.out.println("ATM blocked");
                    System.out.println("you exceeds your atempts.");
                    sc.close();
                    return;
                }

                System.out.println("\nLogin Successful!");
                
                int choice;
                do{
                     System.out.println("\n===== ATM MENU =====");
                     System.out.println("1. Check Balance");
                     System.out.println("2. Deposit Money");
                     System.out.println("3. Withdraw Money");
                     System.out.println("4. Exit");
                     System.out.print("Enter your choice: ");
                     choice = sc.nextInt();

                    switch(choice){
                    case 1:
                          atm.checkBalance();
                          break;

                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        double deposit = sc.nextDouble();
                        atm.deposit(deposit);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdraw = sc.nextDouble();
                        atm.withdraw(withdraw);
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                    }
                }
                 while(choice != 4);
            }
        }



  