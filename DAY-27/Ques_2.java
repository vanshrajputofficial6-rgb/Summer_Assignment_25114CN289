//Write a program to Create Employee system.
import java.util.ArrayList;
import java.util.Scanner;
class Employee{
    private String name;
    private String Role;
    private String ID;
    private double Salary; 

    public Employee(String name, String Role, String ID, double Salary){
        this.name = name;
        this.Role = Role;
        this.ID = ID;
        this.Salary = Salary;

    }


    public String getname(){return name;} 
    public void setname(String name){this.name = name;}

    public String getRole(){return Role;} 
    public void setRole(String Role){this.Role = Role;}

    public String getID(){return ID;}
    public void setID(String ID){this.ID = ID;}

    public double getSalary(double Salary){return Salary;} 
    public void setSalary(double Salary){this.Salary = Salary;}

    public String toString(){
        return "Name: " + name + " | Role: " + Role + " | ID: " + ID + " | Salary: " + Salary;
    }
}
public class Ques_2{
        private static ArrayList<Employee> employeeList= new ArrayList<>();
        private static Scanner sc = new Scanner(System.in);

         public static void main(String[]args){
            while(true){
                System.out.println("\n==========EMPLOYEE-RECORD==========");
                System.out.println("1. ADD EMPLOYEE");
                System.out.println("2. DISPLAY EMPLOYEE LIST");
                System.out.println("3. SEARCH EMPLOYEE BY ID");
                System.out.println("4. DELETE EMPLOYEE");
                System.out.println("5. EXIT");
                System.out.println("=====================================\n");

                System.out.print("Enter your choice(1-5): ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        displayEmployees();
                        break;
                    case 3:
                        searchEmployee();
                        break;
                    case 4:
                        deleteEmployee();
                        break;
                    case 5:
                        System.out.println("\nExiting from Employee Record, Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Enter valid number(1-5)");
                    }
                }
            }

            private static void addEmployee(){
                System.out.print("Enter the ID: ");
                String ID = sc.nextLine();
                for(Employee e : employeeList){
                    if(e.getID().equalsIgnoreCase(ID)){
                        System.out.println("Erros: A Employee with this ID already exists.");
                        return;
                    }
                }

                System.out.print("Enter employee name: ");
                String name = sc.nextLine();
                System.out.print("Enter Employee Role: ");
                String Role = sc.nextLine();
                System.out.print("Enter employee Salary: ");
                double Salary = sc.nextDouble();
                sc.nextLine();

                employeeList.add(new Employee(name, Role, ID, Salary));
                System.out.println("Employee details added Succesfully!");
            }

            private static void displayEmployees(){
                if(employeeList.isEmpty()){
                    System.out.println("No record found.");
                }
                System.out.println("--------------------------------Employee List---------------------------------");
                for(Employee e : employeeList){
                    System.out.println(e);
                }
            }

            private static void searchEmployee(){
                System.out.println("Enter the ID; ");
                String ID = sc.nextLine();
                for(Employee e : employeeList){
                    if(e.getID().equalsIgnoreCase(ID)){
                        System.out.println("\nEmployee found\n" + e);
                        return;
                    }
                }
                System.out.println("Employee with ID " + ID + " is not found.");
            }    

            private static void deleteEmployee(){
            System.out.print("Enter the ID: ");
                String ID = sc.nextLine();

                for(int i=0; i<employeeList.size(); i++){
                    if(employeeList.get(i).getID().equalsIgnoreCase(ID)){
                        employeeList.remove(i);
                        System.out.println("Employee record deleted Succesfully");
                        return;
                    }
                }
                System.out.println("Employee with ID " + ID + " is not found.");
            }    
        } 

