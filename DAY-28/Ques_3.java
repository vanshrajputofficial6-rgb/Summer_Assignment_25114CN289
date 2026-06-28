//Write a program to Create ticket booking system.
import java.util.Scanner;

class TicketBooking {
    int totalTickets = 50;


    void bookTicket(int tickets) {
        if (tickets <= totalTickets) {
            totalTickets -= tickets;
            System.out.println(tickets + " ticket(s) booked successfully.");
        } else {
            System.out.println("Sorry! Only " + totalTickets + " ticket(s) available.");
        }
    }

    
    void cancelTicket(int tickets) {
        totalTickets += tickets;
        System.out.println(tickets + " ticket(s) cancelled successfully.");
    }

    
    void displayTickets() {
        System.out.println("Available Tickets: " + totalTickets);
    }
}

public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBooking booking = new TicketBooking();

        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int book = sc.nextInt();
                    booking.bookTicket(book);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();
                    booking.cancelTicket(cancel);
                    break;

                case 3:
                    booking.displayTickets();
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}