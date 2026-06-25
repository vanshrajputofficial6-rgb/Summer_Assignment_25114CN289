//Write  aprogram to sort names alphabetically
import java.util.Arrays;
class Ques_3{
    public static void arrangeNames(String[] names){
        int n = names.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if((names[j].compareTo(names[j+1]) > 0)){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
    System.out.println("Names in allpabetical: " + Arrays.toString(names));
    }
    public static void main(String[]args){
        String[] names ={"Masood","Rahul","Keshav","Asmit","Priyanshu","Mritunjay","Vishal","Vansh"};
        arrangeNames(names);

    }
}