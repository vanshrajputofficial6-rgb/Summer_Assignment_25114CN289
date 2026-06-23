//Write a program to Check anagram strings.
import java.util.Arrays;
class Ques_3{
    public static boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        int[] charCounts = new int[26];

        for(int i=0; i< str1.length(); i++){
            charCounts[str1.charAt(i)-'a']++;
            charCounts[str2.charAt(i)-'a']--;
        } 
        for(int count : charCounts){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String str1 = "listen";
        String str2 = "silent";

        if(isAnagram(str1, str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams ");
        }else{
            System.out.println(str1 + " and " + str2 + " are NOT anagrams ");
        }
    }
}