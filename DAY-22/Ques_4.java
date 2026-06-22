//Write a program to Remove spaces from string. 
class Ques_4{
    public static String removeSpaces(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(c != ' '){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        String str = "Rangdar Motu Patlu";
        System.out.println("Sentence is: " + str);
        String result = removeSpaces(str);
        System.out.println("Senstence afater removing spaces: " + result);
    }
}