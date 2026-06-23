//Write a prgram to Find maximum occuring character.
class Ques_4{
    public static char findMaxOccuringChar(String str){
         int[] count = new int[256];

        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        int maxCount = -1;
        char result = ' ';

        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)] > maxCount){
                maxCount = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[]args){
        String str = "succes";
        System.out.println("The maximum occuring charcter is: " + findMaxOccuringChar(str));
    }
}