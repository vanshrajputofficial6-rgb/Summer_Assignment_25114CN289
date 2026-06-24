//Write a program to Check string rotation.
class Ques_1{
    public static boolean rotateString(String str, String goal){
        if(str.length() != goal.length()){
            return false;
        }
        String doubled = str+str;

        return doubled.contains(goal);
    }
    public static void main(String[]args){
        String str = "abcde";
        String goal = "cdeab";

        if(rotateString(str, goal)){ 
            System.out.println("True");
        }else{
            System.out.println("False");
        } 
    }
}