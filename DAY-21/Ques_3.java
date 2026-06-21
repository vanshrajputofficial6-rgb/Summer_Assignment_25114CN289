//Write a program to Count vowels and constants.
class Ques_3{
    public static void count_vowels_const(String str){
        int countv = 0;
        int countc = 0;
       String low = str.toLowerCase();
       for(int i=0; i<str.length(); i++){
            char ch = low.charAt(i);
       if(ch >= 'a' && ch<='z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u'){
                countv++;
            }else{
                countc++;
            }
        }
       }
        System.out.println("String: " + str);
        System.out.println("Number of vowels: " + countv + "\nNumber of constant: " + countc);
    }
    public static void main(String[]args){
        String str = "Rangdar Motu Patlu";
        count_vowels_const(str);   
    }
}