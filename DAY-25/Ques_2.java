//Write program to Find common characters in strings.
class Ques_2{
    public static void commonCharacter(String str1, String str2){
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                   sb.append(str1.charAt(i));
                   continue;
                }
            }
        }
        System.out.println("Common charcater in strings: " + sb);
    }
    public static void main(String[]args){
        String str1 = "Ravan";
        String str2 = "Ram";

       commonCharacter(str1, str2);
    }
}