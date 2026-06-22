//Write a program to Count words in a sentences.
class Ques_2{
    public static int countWords(String str){
        int count = 0;
        String str1 = str.toLowerCase();
        char[] arr = str1.toCharArray();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == ' '){
                count++;
                continue;
            }
        }
       int result = count+1;
       return result;
    }
    public static void main(String[]args){
        String str = "Rangdar Motu Patlu";
        int noofWords = countWords(str);
        System.out.println("No of words in snetence: " + noofWords);
    }
}