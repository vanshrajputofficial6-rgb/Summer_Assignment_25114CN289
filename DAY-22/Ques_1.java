//Write a program to Check palidrom string;
class Ques_1{
    public static boolean checkPalidrome(String str){
        String str1 = str.toLowerCase();
        char[] arr = str1.toCharArray();
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String str = "Level";
        if(checkPalidrome(str) == true){
            System.out.println("Palidroeme");
        }else{
            System.out.println("Not Palidrome");
        }
    }
}