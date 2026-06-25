//Write a program to Sort words by length.
import java.util.Arrays;
class Ques_4{
    public static void sortWordsLength(String[] names){
        int n = names.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(((names[j].length())>(names[j+1].length()) != false)){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
    System.out.println("Names after sorting: " + Arrays.toString(names));
    }
    public static void main(String[]args){
        String[] names ={"Masood","Rahul","Keshav","Asmit","Priyanshu","Mritunjay","Vishal","Vansh"};
        sortWordsLength(names);

    }
}