//Write a program to Create Student Management system.
import java.util.ArrayList;
import java.util.Scanner;
class Student{
    private String name;
    private int Roll_no;
    private String Section;
    private String Admission_ID;
    private double GPA; 

    public Student(String name, int Roll_no, String Section, String Admission_ID, double GPA){
        this.name = name;
        this.Roll_no = Roll_no;
        this.Section = Section;
        this.Admission_ID = Admission_ID;
        this.GPA = GPA;

    }

    public int getRoll_no(){return Roll_no;} 
    public void setRoll_no(int Roll_no){this.Roll_no = Roll_no;}

    public String getname(){return name;} 
    public void setname(String name){this.name = name;;}

    public String getSection(){return Section;} 
    public void setSection(String Section){this.Section = Section;}

    public String getAdmission_ID(){return Admission_ID;}
    public void setAdmssion_ID(String Admission_ID){this.Admission_ID = Admission_ID;}

    public double getGPA(double GPA){return GPA;} 
    public void setGPA(double GPA){this.GPA = GPA;}

    public String toString(){
        return "Name: " + name + " | Roll_no: " + Roll_no + " | Section: " + Section + " | Admission_ID: " + Admission_ID + " | GPA: " + GPA;
    }
}
public class Ques_1{
        private static ArrayList<Student> studentList= new ArrayList<>();
        private static Scanner sc = new Scanner(System.in);

         public static void main(String[]args){
            while(true){
                System.out.println("\n==========STUDENT-RECORD==========");
                System.out.println("1. ADD STUDENT");
                System.out.println("2. DISPLAY STUDENT LIST");
                System.out.println("3. SEARCH STUDENT BY ADMISSION ID");
                System.out.println("4. DELETE STUDENT");
                System.out.println("5. EXIT");
                System.out.println("=====================================\n");

                System.out.print("Enter your choice(1-5): ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displayStudents();
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        System.out.println("\nExiting from Student Record, Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Enter valid number(1-5)");
                    }
                }
            }

            private static void addStudent(){
                System.out.print("Enter the Admission_ID: ");
                String Admission_ID = sc.nextLine();
                for(Student s : studentList){
                    if(s.getAdmission_ID().equalsIgnoreCase(Admission_ID)){
                        System.out.println("Erros: A student with this Admission_ID already exists.");
                        return;
                    }
                }

                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student Roll_no: ");
                int Roll_no = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter student Section: ");
                String Section = sc.nextLine();
                System.out.print("Enter student GPA: ");
                double GPA = sc.nextDouble();

                studentList.add(new Student(name, Roll_no, Section, Admission_ID, GPA));
                System.out.println("Student details added Succesfully!");
            }

            private static void displayStudents(){
                if(studentList.isEmpty()){
                    System.out.println("No record found.");
                }
                System.out.println("--------------------------------Student List---------------------------------");
                for(Student s : studentList){
                    System.out.println(s);
                }
            }

            private static void searchStudent(){
                System.out.println("Enter the Admission_ID; ");
                String Admission_ID = sc.nextLine();
                for(Student s : studentList){
                    if(s.getAdmission_ID().equalsIgnoreCase(Admission_ID)){
                        System.out.println("\nStudent found\n" + s);
                        return;
                    }
                }
                System.out.println("Student with Admission_ID " + Admission_ID + " is not found.");
            }    

            private static void deleteStudent(){
            System.out.print("Enter the Admission_ID: ");
                String Admission_ID = sc.nextLine();

                for(int i=0; i<studentList.size(); i++){
                    if(studentList.get(i).getAdmission_ID().equalsIgnoreCase(Admission_ID)){
                        studentList.remove(i);
                        System.out.println("Student record deleted Succesfully");
                        return;
                    }
                }
                System.out.println("Student with Admission_ID " + Admission_ID + " is not found.");
            }    
        } 

