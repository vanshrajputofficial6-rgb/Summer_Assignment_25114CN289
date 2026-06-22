//Write a program to Characer frequency.
class Ques_3{
    public static int characterFrequency(String str, char c){
        int count = 0;
        String str1 = str.toLowerCase();
        char[] arr = str1.toCharArray();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == c){
                count++;
                continue;
            }
        } 
        return count;
    }
    public static void main (String[]args){
        String str = "Rangdar Motu Patlu";
        char c = 'a';
        int result = characterFrequency(str, c);
        System.out.println("String is " + str);
        System.out.println("Frequency of " + c + " is: " + result);
    }
}