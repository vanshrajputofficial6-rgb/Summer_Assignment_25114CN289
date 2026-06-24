//Write a program to Remove duplicate characters.
class Ques_4{
    public static String removeDuplicate(String str){
        String s = "" + str.charAt(0);
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr != prev){
                s = s + curr;
            }
        }
        return s;
    }
    public static void main(String[]args){
        String str = "success";
        System.out.println("String after duplictes: " + removeDuplicate(str));
    }
}