//Write aprogram to Find string length without strlen(). 
class Ques_1{
    public static int string_length(String str){
    int count = 0;
    char[] arr = str.toCharArray();
        for(char m : arr){
            count++;
        }
        return count;
     }
    public static void main(String[]args){
        String str = "Chota Bheem";
        int result = string_length(str);
        System.out.println("Length of string is: " + result);
    }
}