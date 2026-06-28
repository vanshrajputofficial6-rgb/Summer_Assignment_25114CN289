//Write a program to Create library system.
import java.util.ArrayList;
import java.util.Scanner;
class Library{
    private int id;
    private String name;
    private String book_name;
    private String book_id;
    private String from;
    private String to;

    Library(int id, String name, String book_name, String book_id, String from, String to){
        this.id = id;
        this.name = name;
        this.book_name = book_name;
        this.book_id = book_id;
        this.from = from;
        this.to = to;
    }

    public int getid(){return id;}
    public void setid(int id){this.id = id;}

    public String getname(){return name;}
    public void setname(String name){this.name = name;}

    public String getbook_name(){return book_name;}
    public void setbook_name(String book_name){this.book_name = book_name;}

    public String getbook_id(){return book_id;}
    public void setid(String book_id){this.book_id = book_id;}

    public String getfrom(){return from;}
    public void setfrom(String from){this.from = from;}

    public String getto(){return to;}
    public void setto(String to){this.to = to;}

    @Override
    public String toString(){
        return "ID: " + id + " | Name: " + name + " | Book Name: " + book_name + " | Book ID: " + book_id + " | From: " + from + " | To: " + to;
    }
}
public class Ques_1{
    private static ArrayList<Library> libraryList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int choice;
        do{
            System.out.println("\n=======LIBRARY-RECORD======");
            System.out.println("1. ADD STUDENT ");
            System.out.println("2. LIBRARY RECORD ");
            System.out.println("3. SEARCH STUDENT ");
            System.out.println("4. REMOVE STUDENT ");
            System.out.println("5. EXIT ");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2: 
                    displayRecord();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("\nExiting from Library Record, Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Enter valid number(1-5)");
                }
        }while(choice != 5);
    }

        public static void addStudent(){
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();

            for(Library l : libraryList){
                if(l.getid() == id){
                    System.out.println("Student with same id already exist.");
                    System.out.println("Enter valid id.");
                    return;
                }
            }
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter book_name: ");
            String book_name = sc.nextLine();

            System.out.print("Enter book_id: ");
            String book_id = sc.nextLine();

            System.out.print("Enter form: ");
            String from = sc.nextLine();

            System.out.print("Enter to: ");
            String to = sc.nextLine();

            libraryList.add(new Library(id, name, book_name, book_id, from, to));
            System.out.println("Student details added Successfuly!");
        }

        public static void displayRecord(){
            if(libraryList.isEmpty()){
                    System.out.println("No record found.");
            }
            System.out.println("---------------------Library-Record-------------------\n");
            for(Library l : libraryList){
                System.out.println(l);
            }
        }

        public static void searchStudent(){
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();

            for(Library l : libraryList){
                if(l.getid() == id){
                System.out.println("\nStudent found\n" + l);
                return;
                }
            }
            System.out.println("Student with ID " + id + " not found.");
                
            }
        

        public static void deleteStudent(){
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();

            for(Library l : libraryList){
                if(l.getid() == id){
                    libraryList.remove(l);
                    System.out.println("Student removed Successfuly!");
                    return;
                    }
                }
                System.out.println("Student with ID " + id + " Not found.");
            }
    }


