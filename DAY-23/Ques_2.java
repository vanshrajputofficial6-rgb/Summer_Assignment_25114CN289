//Write a program to Find first repeating character.
class Ques_2{
    public static Character firstRepeatingChar(String str){
        if(str == null || str.isEmpty()){
            return null;
        }
        char[] arr = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] == arr[i]){
                return arr[i];
                }
                break;
            }
        }
        return null;
    }
     public static void main(String[]args){
        String str = "abcbba";
        Character result = firstRepeatingChar(str);

        if(result != null){
            System.out.println("The first non repeating character is " + result);
        }else{
            System.out.println("No non repeating charcter found");            
        }
    }
}